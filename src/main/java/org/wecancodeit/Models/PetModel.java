package org.wecancodeit.Models;

import java.util.ArrayList;

import org.wecancodeit.Models.Enums.PetTypeEnum;

//*base pet class */
public abstract class PetModel {
    private long id;
    private String name;
    private PetTypeEnum petType;
    private String imageUrl;

    private ArrayList<Long> scheduledTaskIds;

    public PetModel() {
    }

    public PetModel(String name, PetTypeEnum petType, String imageUrl, ArrayList<Long> scheduledTaskIds) {
        this.name = name;
        this.petType = petType;
        this.imageUrl = imageUrl;

        this.scheduledTaskIds = scheduledTaskIds;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Long> getScheduledTaskIds() {
        return scheduledTaskIds;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PetTypeEnum getPetType() {
        return petType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "PetModel [id=" + id + ", name=" + name + ", petType=" + petType + ", imageUrl=" + imageUrl + "]";
    }

}