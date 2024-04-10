package org.wecancodeit.virtualpet4.DTO;

import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;
import org.wecancodeit.virtualpet4.Models.AdoptersModel;
import org.wecancodeit.virtualpet4.Models.ShelterModel;
import org.wecancodeit.virtualpet4.Models.Enums.AdoptionStatusEnum;

public class AdopterDTO {

    private Long id;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;
    private String state;
    private String phoneNumber;
    private String email;
    private String imageUrl;
    public PetTypeEnum preferredPetType;
    public AdoptionStatusEnum adoptionStatus;
    public ShelterModel shelterModel;

    public AdopterDTO() {
    }

    public AdopterDTO(Long id, String name, String address1, String address2, String city, String zip, String state,
            String phoneNumber, String email, String imageUrl) {
        this.id = id;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imageUrl = imageUrl;
        this.preferredPetType = preferredPetType;
        this.adoptionStatus = adoptionStatus;
        this.shelterModel = shelterModel;

    }

    public AdopterDTO(AdoptersModel model) {
        this.id = model.getId();
        this.name = model.getName();
        this.address1 = model.getAddress1();
        this.address2 = model.getAddress2();
        this.city = model.getCity();
        this.zip = model.getZip();
        this.state = model.getZip();
        this.phoneNumber = model.getPhoneNumber();
        this.email = model.getEmail();
        this.imageUrl = model.getImageUrl();
        this.preferredPetType = model.getPreferredPetType();
        this.adoptionStatus = model.getAdoptionStatus();
        this.shelterModel = model.getShelterModel();

    }

    public AdoptersModel convertToModel() {
        if (id == null) {
            id = 0l;
        }
        AdoptersModel adopter = new AdoptersModel(this.getId(),
                this.getName(),
                this.getAddress1(),
                this.getAddress2(),
                this.getCity(),
                this.getZip(),
                this.getState(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getImageUrl(),
                this.getPreferredPetType(),
                this.getAdoptionStatus(),
                this.getShelterModel());
        return adopter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public PetTypeEnum getPreferredPetType() {
        return preferredPetType;
    }

    public void setPreferredPetType(PetTypeEnum preferredPetType) {
        this.preferredPetType = preferredPetType;
    }

    public AdoptionStatusEnum getAdoptionStatus() {
        return adoptionStatus;
    }

    public void setAdoptionStatus(AdoptionStatusEnum adoptionStatus) {
        this.adoptionStatus = adoptionStatus;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public void setShelterModel(ShelterModel shelterModel) {
        this.shelterModel = shelterModel;
    }

    @Override
    public String toString() {
        return "AdopterDTO [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
                + ", city=" + city + ", zip=" + zip + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email="
                + email + ", imageUrl=" + imageUrl + "]";
    }

}
