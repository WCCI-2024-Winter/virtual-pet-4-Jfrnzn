
package org.wecancodeit.virtualpet4.DTO;


public class ShelterLookUpDto {

    private long id;
    private String name;

    public ShelterLookUpDto() {
    }

    public ShelterLookUpDto(String name, long id) {
        this.id = id;
        this.name = name;
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

}
