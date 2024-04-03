package org.wecancodeit.Models;

import org.wecancodeit.Models.Enums.*;


public class AdoptersModel extends ContactModel {

    private PetTypeEnum preferredPetType;
    private AdoptionStatusEnum adoptionStatus;
    private ShelterModel shelterModel;

    /**
     * 
     * @param name
     * @param address1
     * @param address2
     * @param city
     * @param zip
     * @param state
     * @param phoneNumber
     * @param email
     * @param imageUrl
     * @param petType
     * @param adoptionStatus
     * @return
     */

    public AdoptersModel(Long id, String name, String address1, String address2, String city,
            String zip, String state, String phoneNumber, String email, String imageUrl, PetTypeEnum petType,
            AdoptionStatusEnum adoptionStatus) {
        super(id,name, address1, address2, city, zip, state, phoneNumber, email, imageUrl);
        this.preferredPetType = petType;
        this.adoptionStatus = adoptionStatus;
    }

    public AdoptersModel(PetTypeEnum petType) {
        this.preferredPetType = petType;
    }

    public PetTypeEnum getPetType() {
        return preferredPetType;
    }

    @Override
    public String toString() {
        return "AdoptersModel [preferredPetType=" + preferredPetType + ", adoptionStatus=" + adoptionStatus
                + ", shelterModel=" + shelterModel + "]";
    }

}
