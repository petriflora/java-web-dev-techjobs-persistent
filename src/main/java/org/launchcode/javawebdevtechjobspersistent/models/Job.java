package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @NotNull(message = "Employer name is required.")
    private Employer employer;

//    private List<Integer> skills;
    private String skills;

    public Job() {
    }

//    public Job(Employer anEmployer, List<Integer> someSkills) {
    public Job(String name,Employer anEmployer, String someSkills) {
        super(name);
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public List<Integer> getSkills() {
    public String getSkills() {
        return skills;
    }

//    public void setSkills(List<Integer> skills) {
    public void setSkills(String skills) {
        this.skills = skills;
    }
}
