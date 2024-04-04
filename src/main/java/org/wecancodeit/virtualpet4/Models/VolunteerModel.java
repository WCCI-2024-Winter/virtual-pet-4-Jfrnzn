package org.wecancodeit.virtualpet4.Models;

import java.util.*;

public class VolunteerModel extends ContactModel {

    private Collection<ShelterModel> shelterModel;

    public VolunteerModel() {
        super();
    }

    public VolunteerModel(Long id,String name, String address1, String address2, String city,
            String zip, String state, String phoneNumber, String email, String imageUrl) {
        super(id, name, address1, address2, city, zip, state, phoneNumber, email, imageUrl);

    }

    @Override
    public String toString() {
        return "VolunteerModel [shelterModel=" + shelterModel + "]";
    }

}
