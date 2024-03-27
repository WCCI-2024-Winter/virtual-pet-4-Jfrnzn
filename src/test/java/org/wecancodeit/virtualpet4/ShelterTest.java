package org.wecancodeit.virtualpet4;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.wecancodeit.Models.ShelterModel;
import org.wecancodeit.Repositories.ShelterRepository;

@SpringBootTest
public class ShelterTest {
    
    @Test 
    public void getById() throws Exception{
        ShelterRepository shelter = new ShelterRepository("http://localhost:8080/api/v1/shelters/");
        ShelterModel model = shelter.getById(1l);
        assertEquals(1l, model.getId());
}
}