package org.wecancodeit.Repositories;

import org.wecancodeit.Models.ShelterModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShelterRepository extends ClientHttp {

    private ObjectMapper objectMapper = new ObjectMapper();

    public ShelterRepository(String baseURLString) {
        super(baseURLString);
    }

    public ShelterModel getById(Long id) throws Exception{
        String model = GetURL(id.toString());
   
        ShelterModel result = objectMapper.readValue(model, ShelterModel.class);
        return result;
    }

}