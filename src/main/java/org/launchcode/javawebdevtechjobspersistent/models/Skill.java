package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 200, message = "Entry must be less than 200 characters.")
    private String longSkillDescription;

    public String getLongSkillDescription() {
        return longSkillDescription;
    }

    public void setLongSkillDescription(String longSkillDescription) {
        this.longSkillDescription = longSkillDescription;
    }

    public Skill() {
    }

    public Skill(String name, String longSkillDescription) {
        super(name);
        this.longSkillDescription = longSkillDescription;
    }


}