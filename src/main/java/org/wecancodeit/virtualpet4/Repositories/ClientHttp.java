package org.wecancodeit.virtualpet4.Repositories;

import java.net.*;

import org.wecancodeit.virtualpet4.Models.ShelterModel;

import java.io.*;

public abstract class ClientHttp<entity> {
    private final String baseURLString;

    public ClientHttp(String baseURLString) {
        this.baseURLString = baseURLString;
    }

    protected String getURL(String urlString) throws Exception {
        HttpURLConnection connection = null;
        StringBuffer response = new StringBuffer();
        try {

            // Create a URL object with the API endpoint
            URL url = new URL(baseURLString + urlString);
            // Open a connection to the URL
            connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Set request headers if needed
            connection.setRequestProperty("Content-Type", "application/json");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // If the response code is OK (200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a BufferedReader to read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                // Read the response line by line
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
            } else {
                throw new Exception(responseCode + " Response Code from urlGet");
            }
            connection.disconnect();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                // Close the connection putting it here ensures no memory leak
                connection.disconnect();
            }
        }
        return response.toString();
    }

    protected String saveObject(String jsonString) throws Exception {
        HttpURLConnection connection = null;
        StringBuffer response = new StringBuffer();
        try {

            URL url = new URL(baseURLString);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            ;
            connection.setDoOutput(true);

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
            } else {
                throw new Exception(responseCode + "Response Code from urlGet");
            }
            connection.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return response.toString();
    }

    public boolean deleteObject(Long id) {
        HttpURLConnection connection = null;
        boolean response = false;
        try {
            URL url = new URL(baseURLString + id.toString());

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("DELETE");

            connection.setRequestProperty("Content-Type", "application/json");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                response = true;
            } else {
                throw new Exception(responseCode + "response Code from deleteObject");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return response;
    }
}
