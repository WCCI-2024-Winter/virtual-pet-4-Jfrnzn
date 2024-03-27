package org.wecancodeit.Models;

import java.util.*;
import jakarta.validation.constraints.Size;

public class VolunteerModel extends ContactModel {

    private Collection<ShelterModel> shelterModel;

    public VolunteerModel() {
        super();
    }

    public VolunteerModel(String name, String address1, String address2, String city,
             String zip,
            String state, String phonenumber, String email, String imageUrl) {
        super(name, address1, address2, city, zip, state, phonenumber, email, imageUrl);

    }

}
