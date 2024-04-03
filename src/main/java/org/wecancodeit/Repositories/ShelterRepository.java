package org.wecancodeit.Repositories;

import org.wecancodeit.Models.ShelterModel;

import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShelterRepository extends ClientHttp {

    private ObjectMapper objectMapper = new ObjectMapper();

    public ShelterRepository(String baseURLString) {
        super(baseURLString);
    }

    public ShelterModel getById(Long id) throws Exception {
        String model = getURL(id.toString());

        ShelterModel result = objectMapper.readValue(model, ShelterModel.class);
        return result;
    }

    public Collection<ShelterModel> getAll(String urlPath) throws Exception {
        List<ShelterModel> shelterList = null;
        try {
            String jsonString = getURL(urlPath);
            shelterList = objectMapper.readValue(jsonString, new TypeReference<List<ShelterModel>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shelterList;
    }
}