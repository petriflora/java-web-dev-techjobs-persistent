package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "This is a required field.")
    @Size(min = 2, max = 50, message = "Entry must be between 2 and 50 characters.")
    private String location;

    @OneToMany
    @JoinColumn(name="employer")
    private final List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employer() {
    }

    public Employer(String name, String location) {
        super(name);
        this.location = location;
    }
}
