package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.*;

import org.wecancodeit.virtualpet4.Models.ShelterModel;

import com.fasterxml.jackson.core.JsonProcessingException;
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

  

    public boolean deleteById(Long id) throws Exception{
        deleteObject(id);
        return true;
    }

    public ShelterModel SaveShelter(ShelterModel model) throws Exception {
        try {
            String json = objectMapper.writeValueAsString(model);
            String result = saveObject(json);
            model = objectMapper.readValue(result, new TypeReference<ShelterModel>() {});
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return model;

    }

 

}
