package org.wecancodeit.Models;



import java.util.ArrayList;
import java.util.Collection;


import jakarta.validation.constraints.Size;


public class ShelterModel extends ContactModel {
    private String website;

 
    private Collection<OrganicPetModel> organicPets;

    private Collection<RoboticPetModel> roboticPets;

    private Collection<AdoptersModel> adoptersModel;

    private Collection<VolunteerModel> volunteerModel;

    public ShelterModel() {
        super();

    }

    public ShelterModel(String name, String address1, String address2, String city, @Size(max = 10, min = 5) String zip,
            String state, String phonenumber, String email, String imageUrl, String website) {
        super(name, address1, address2, city, zip, state, phonenumber, email, imageUrl);
        this.website = website;
        this.organicPets = new ArrayList<>();
        this.roboticPets = new ArrayList<>();

    }

    public ShelterModel(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public Collection<OrganicPetModel> getOrganicPets() {
        return organicPets;
    }

    public Collection<RoboticPetModel> getRoboticPets() {
        return roboticPets;
    }

    public Collection<AdoptersModel> getAdoptersModel() {
        return adoptersModel;
    }

    public Collection<VolunteerModel> getVolunteerModel() {
        return volunteerModel;
    }

    @Override
    public String toString() {
        return super.toString() + "ShelterModel [website=" + website + ", organicPets=" + organicPets + ", roboticPets="
                + roboticPets + "]";
    }

}


