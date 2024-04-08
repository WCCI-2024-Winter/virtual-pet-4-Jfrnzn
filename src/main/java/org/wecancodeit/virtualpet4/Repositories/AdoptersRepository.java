package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.List;

import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdoptersRepository extends ClientHttp {
    public AdoptersRepository(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 
     * @param name
     * @return
     */
    private AdoptersModel findByName(String name) throws Exception {
        String model = getURL(name);
        AdoptersModel result = objectMapper.readValue(model, AdoptersModel.class);
        return result;
    }

    Iterable<AdoptersModel> findByPreferredPetType(String urlPath) throws Exception {
        List<AdoptersModel> adoptersList = null;
        try {
            String jsonString = getURL(urlPath);
            adoptersList = objectMapper.readValue(jsonString, new TypeReference<List<AdoptersModel>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adoptersList;

    }
    /**
     * 
     * @param preferredPetType
     * @param zip
     * @return
     */

    // Iterable<AdoptersModel> findPreferredPetType(String preferredPetType, String
    // zip);

}
