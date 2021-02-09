package org.launchcode.javawebdevtechjobspersistent.models.dto;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;

import javax.validation.constraints.NotNull;

public class JobSkillDTO {

    @NotNull
    private Job job;

    @NotNull
    private Skill skill;

    public JobSkillDTO() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
