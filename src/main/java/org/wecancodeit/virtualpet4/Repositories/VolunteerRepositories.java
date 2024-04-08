package org.wecancodeit.virtualpet4.Repositories;

import org.wecancodeit.virtualpet4.Models.VolunteerModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VolunteerRepositories extends ClientHttp {
    public VolunteerRepositories(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    private VolunteerModel findByName(String name) throws Exception {
        String model = getURL(name);
        VolunteerModel result = objectMapper.readValue(model, VolunteerModel.class);
        return result;
    }
}
