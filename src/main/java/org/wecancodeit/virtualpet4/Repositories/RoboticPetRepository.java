package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.List;

import org.wecancodeit.virtualpet4.Models.RoboticPetModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RoboticPetRepository extends ClientHttp {
    public RoboticPetRepository(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    Iterable<RoboticPetModel> findByManufacturer(String urlPath) throws Exception {
        List<RoboticPetModel> roboticPetList = null;
        try {
            String jsonString = getURL(urlPath);
            roboticPetList = objectMapper.readValue(jsonString, new TypeReference<List<RoboticPetModel>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roboticPetList;
    }

}
