package org.wecancodeit.virtualpet4.DTO;

import org.wecancodeit.virtualpet4.Models.ShelterModel;

public class ShelterDTO {

    private long id;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;
    private String state;
    private String phoneNumber;
    private String email;
    private String imageUrl;
    public String website;

    public ShelterDTO() {
    }

    public ShelterDTO(long id, String name, String address1, String address2, String city, String zip, String state,
            String phoneNumber, String email, String imageUrl, String website) {
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
        this.website = website;
    }

    public ShelterDTO(ShelterModel model) {
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
        this.website = model.getWebsite();

    }

    public ShelterModel convertToModel() {
        ShelterModel shelter = new ShelterModel(this.getId(),
                this.getName(),
                this.getAddress1(),
                this.getAddress2(),
                this.getCity(),
                this.getZip(),
                this.getState(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getImageUrl());
        return shelter;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return "ShelterDTO [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
                + ", city=" + city + ", zip=" + zip + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email="
                + email + ", imageUrl=" + imageUrl + ", website=" + website + "]";
    }

}
