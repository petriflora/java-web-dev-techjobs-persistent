package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 200, message = "Entry must be less than 200 characters.")
    private String longSkillDescription;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(String name, String longSkillDescription) {
        super(name);
        this.longSkillDescription = longSkillDescription;
    }

    public Skill() {
    }

    public String getLongSkillDescription() {
        return longSkillDescription;
    }

    public void setLongSkillDescription(String longSkillDescription) {
        this.longSkillDescription = longSkillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}