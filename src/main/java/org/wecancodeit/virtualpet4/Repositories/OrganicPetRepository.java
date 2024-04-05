package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.wecancodeit.virtualpet4.Models.OrganicPetModel;

import com.fasterxml.jackson.core.type.TypeReference;

public class OrganicPetRepository extends ClientHttp {
    public OrganicPetRepository(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    Iterable<OrganicPetModel> findByBreed(String urlPath) throws Exception {
        List<OrganicPetModel> organicPetList = null;
        try {
            String jsonString = getURL(urlPath);
            organicPetList = objectMapper.readValue(jsonString, new TypeReference<List<OrganicPetModel>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return organicPetList;
    }
}