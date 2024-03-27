package org.wecancodeit.Repositories;

import java.net.HttpURLConnection;


import java.net.*;
import java.io.*;

public abstract class ClientHttp {

    private String baseUrl;

    public ClientHttp(String baseUrlString) {
        this.baseUrl = baseUrlString;
    }

    protected String GetURL(String urlString) throws Exception {
        HttpURLConnection connection = null;
        StringBuffer response = new StringBuffer();
    
        try {

            URL url = new URL(baseUrl);

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.setRequestProperty("content - Type", "application/json");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK)

            {

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);

                }
                in.close();

            } else {
                throw new Exception(responseCode + " Response Code");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return response.toString();

    }

}
