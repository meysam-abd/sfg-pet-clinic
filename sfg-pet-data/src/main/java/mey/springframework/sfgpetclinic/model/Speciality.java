package mey.springframework.sfgpetclinic.model;

import java.util.Set;

public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
