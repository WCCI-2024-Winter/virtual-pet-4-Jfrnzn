package org.wecancodeit.virtualpet4.Repositories;

import java.io.IOException;
import java.util.List;
import org.wecancodeit.virtualpet4.Models.PetMaintenanceModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetMaintenanceRepository extends ClientHttp{
    public PetMaintenanceRepository(String baseURLString) {
        super(baseURLString);
    }
    private ObjectMapper objectMapper = new ObjectMapper();

Iterable<PetMaintenanceModel> findByName(String urlPath) throws Exception{
    List<PetMaintenanceModel> maintenanceList = null;
    try {
        String jsonString = getURL(urlPath);
        maintenanceList = objectMapper.readValue(jsonString, new TypeReference<List<PetMaintenanceModel>>() {
        });
    } catch (IOException e) {
        e.printStackTrace();
    }
    return maintenanceList;
}
}