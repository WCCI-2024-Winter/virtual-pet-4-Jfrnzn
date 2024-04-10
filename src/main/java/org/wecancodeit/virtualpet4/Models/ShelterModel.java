package org.wecancodeit.virtualpet4.Models;



import java.util.ArrayList;
import java.util.Collection;





public class ShelterModel extends ContactModel {
    private String website;

 
    private Collection<OrganicPetModel> organicPets;

    private Collection<RoboticPetModel> roboticPets;

    private Collection<AdoptersModel> adoptersModel;

    private Collection<VolunteerModel> volunteerModel;

    public ShelterModel() {
        super();

    }

    public ShelterModel(Long id,String name, String address1, String address2, String city, String zip,
            String state, String phoneNumber, String email, String imageUrl, String website) {
        super(id, name, address1, address2, city, zip, state, phoneNumber, email, imageUrl);
        this.website = website;
        this.organicPets = new ArrayList<>();
        this.roboticPets = new ArrayList<>();

    }

    public ShelterModel(Long id, String name, String address1, String address2, String city, String zip, String state,
            String phoneNumber, String email, String imageUrl) {
   
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


