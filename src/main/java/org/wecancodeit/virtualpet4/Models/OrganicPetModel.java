package org.wecancodeit.virtualpet4.Models;

import java.util.ArrayList;

import org.wecancodeit.virtualpet4.Models.Enums.PetHealthEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetMoodEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetTempermentEnum;
import org.wecancodeit.virtualpet4.Models.Enums.PetTypeEnum;


//*model for non-robot pets 
// id will pull from petmodel*/
public class OrganicPetModel extends PetModel {

    private String breed;
    private int petAge;
    private PetHealthEnum petHealth;
    private PetMoodEnum petMood;
    private PetTempermentEnum petTemperment;
    private boolean petFixed;

    private ShelterModel shelterModel;

    public OrganicPetModel() {
        super();

    }

    public OrganicPetModel(String name, PetTypeEnum petType, String imageUrl, String breed,
            int petAge, PetHealthEnum petHealth, PetMoodEnum petMood, PetTempermentEnum petTemperment,
            boolean petFixed, ArrayList<Long> scheduledTaskIds) {
        super(name, petType, imageUrl, scheduledTaskIds);
        this.breed = breed;
        this.petAge = petAge;
        this.petHealth = petHealth;
        this.petMood = petMood;
        this.petTemperment = petTemperment;
        this.petFixed = petFixed;
    }

    public String getBreed() {
        return breed;
    }

    public int getPetAge() {
        return petAge;
    }

    public PetHealthEnum getPetHealth() {
        return petHealth;
    }

    public PetMoodEnum getPetMood() {
        return petMood;
    }

    public PetTempermentEnum getPetTemperment() {
        return petTemperment;
    }

    public boolean isPetFixed() {
        return petFixed;
    }

    @Override
    public String toString() {
        return super.toString() + "OrganicPetModel [petBreed=" + breed + ", petAge=" + petAge + ", petHealth="
                + petHealth
                + ", petMood=" + petMood + ", petTemperment=" + petTemperment + ", petFixed=" + petFixed
                + ", shelterModel=" + shelterModel + "]";
    }

}
