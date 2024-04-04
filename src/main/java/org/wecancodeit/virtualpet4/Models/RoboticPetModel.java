package org.wecancodeit.virtualpet4.Models;

import java.util.ArrayList;

import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;
import org.wecancodeit.virtualpet4.Models.Enums.RoboticHealthEnum;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class RoboticPetModel extends PetModel {

    private String model;

    private String manufacturer;

    private int energyLevel;

    private int oilLevel;

    private ShelterModel shelterModel;

    private RoboticHealthEnum roboticPetHealth;

    public RoboticPetModel() {
        super();
    }

    public RoboticPetModel(String name, PetTypeEnum petType, String imageUrl, String model, String manufacturer,
            @Min(0) @Max(100) int energyLevel, @Min(0) @Max(100) int oilLevel,
            RoboticHealthEnum roboticPetHealth,ArrayList<Long> scheduledTaskIds) {
        super(name, petType, imageUrl, scheduledTaskIds);
        this.model = model;
        this.manufacturer = manufacturer;
        this.energyLevel = energyLevel;
        this.oilLevel = oilLevel;
        this.roboticPetHealth = roboticPetHealth;
        
    }
    


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public ShelterModel getShelterModel() {
        return shelterModel;
    }

    public RoboticHealthEnum getRoboticPetHealth() {
        return roboticPetHealth;
    }

    @Override
    public String toString() {
        return super.toString() + "RoboticPetModel [petModel=" + model + ", Manufacturer=" + manufacturer
                + ", petEnergyLevel="
                + energyLevel + ", petOilLevel=" + oilLevel + ", roboticPetHealth=" + roboticPetHealth + "]";
    }

}
