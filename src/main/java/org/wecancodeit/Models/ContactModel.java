package org.wecancodeit.Models;

public abstract class ContactModel {

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

    public ContactModel() {
    }

    public ContactModel(Long id, String name, String address1, String address2, String city, String zip, String state,
            String phoneNumber, String email, String imageUrl) {
        this.id=id;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getState() {
        return state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "ContactModel [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
                + ", city=" + city + ", zip=" + zip + ", state=" + state + ", phoneNumber=" + phoneNumber + ", email="
                + email + ", imageUrl=" + imageUrl + "]";
    }

}
