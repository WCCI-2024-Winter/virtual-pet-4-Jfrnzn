package org.wecancodeit.virtualpet4.Models;

import org.wecancodeit.virtualpet4.Models.Enums.PetTaskEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;

public class PetMaintenanceModel {


    private Long id;
    private String name;
    private int frequency;
    private PetTypeEnum petType;
    private PetTaskEnum effectedProperty;

    public PetMaintenanceModel() {
    }

    public PetMaintenanceModel(String name, int frequency, PetTypeEnum petType,
            PetTaskEnum effectedProperty) {
        this.name = name;
        this.frequency = frequency;
        this.petType = petType;
        this.effectedProperty = effectedProperty;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public PetTypeEnum getPetType() {
        return petType;
    }

    public PetTaskEnum getEffectedProperty() {
        return effectedProperty;
    }

    @Override
    public String toString() {
        return "PetMaintenanceModel [id=" + id + ", name=" + name + ", frequency=" + frequency + ", petType=" + petType
                + ", effectedProperty=" + effectedProperty + "]";
    }

}
