package org.wecancodeit.virtualpet4.Models;

import org.wecancodeit.virtualpet4.Models.Enums.AdoptionStatusEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;

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
    public AdoptersModel() {
    }

    public AdoptersModel(Long id, String name, String address1, String address2, String city, String zip, String state,
            String phoneNumber, String email, String imageUrl, PetTypeEnum preferredPetType,
            AdoptionStatusEnum adoptionStatus) {
        super(id, name, address1, address2, city, zip, state, phoneNumber, email, imageUrl);
        this.preferredPetType = preferredPetType;
        this.adoptionStatus = adoptionStatus;
        
    }

 
    public AdoptionStatusEnum getAdoptionStatus() {
        return adoptionStatus;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public PetTypeEnum getPreferredPetType() {
        return preferredPetType;
    }

    @Override
    public String toString() {
        return "AdoptersModel [preferredPetType=" + preferredPetType + ", adoptionStatus=" + adoptionStatus
                + ", shelterModel=" + shelterModel + "]";
    }

}
