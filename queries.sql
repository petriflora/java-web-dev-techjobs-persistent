## Part 1:
SELECT id, employer, name, skills
FROM job;

Column types:
ID = INT
Employer = VARCHAR(255)
Name = VARCHAR(255)
Skills = VARCHAR(255)

## Part 2: Test it with SQL
SELECT * FROM techjobs.employer
WHERE location = "Saint Louis, MO"
OR location = "St. Louis, MO"
OR location = "Saint Louis, Missouri"
OR location = "St. Louis, Missouri"
OR location = "Saint Louis"
OR location = "St. Louis"
OR location = "St. Louis City"
OR location - "St. Louis County";

## Part 3: Test it with SQL

I dropped the table by right-clicking on the job table and selecting "Drop table".
If I were going to drop the table with a query I would use this query:
DROP TABLE job;

## Part 4: Test it with SQL

SELECT
	techjobs.skill.id,
    techjobs.skill.name,
    techjobs.skill.long_skill_description,
    techjobs.job.id,
    techjobs.job.name
FROM techjobs.skill
JOIN techjobs.job_skills
ON techjobs.skill.id = techjobs.job_skills.skills_id
JOIN techjobs.job
ON techjobs.job.id = techjobs.job_skills.jobs_id
ORDER BY techjobs.skill.name, techjobs.job.name ASC