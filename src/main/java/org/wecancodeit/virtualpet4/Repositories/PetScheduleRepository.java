package org.wecancodeit.virtualpet4.Repositories;

import org.wecancodeit.virtualpet4.Models.PetTaskScheduleModel;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetScheduleRepository extends ClientHttp {
    public PetScheduleRepository(String baseURLString) {
        super(baseURLString);
    }

    private ObjectMapper objectMapper = new ObjectMapper();

    public PetTaskScheduleModel findByVolunteerId(Long volunteerId) throws Exception {
        String model = getURL(volunteerId.toString());
        PetTaskScheduleModel result = objectMapper.readValue(model, PetTaskScheduleModel.class);
        return result;
    }

    public PetTaskScheduleModel findByPetId(Long petId) throws Exception {
        String model = getURL(petId.toString());
        PetTaskScheduleModel result = objectMapper.readValue(model, PetTaskScheduleModel.class);
        return result;
    }

    public PetTaskScheduleModel findByTaskId(Long taskId) throws Exception {
        String model = getURL(taskId.toString());
        PetTaskScheduleModel result = objectMapper.readValue(model, PetTaskScheduleModel.class);
        return result;
    }

}