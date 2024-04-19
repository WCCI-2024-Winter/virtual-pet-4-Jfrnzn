package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdoptersRepository extends ClientHttp {
    public AdoptersRepository(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    public Collection<AdoptersModel> getAll(String urlPath) throws Exception {
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

    public AdoptersModel getById(Long id) throws Exception {
        String model = getURL(id.toString());
        AdoptersModel result = objectMapper.readValue(model, AdoptersModel.class);
        return result;
    }

    public boolean deleteById(Long id) throws Exception {
        deleteObject(id);
        return true;
    }

    public AdoptersModel saveAdopter(AdoptersModel model) throws Exception {
        try {
            String json = objectMapper.writeValueAsString(model);
            String result = saveObject(json);
            model = objectMapper.readValue(result, new TypeReference<AdoptersModel>() {
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return model;
    }

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
