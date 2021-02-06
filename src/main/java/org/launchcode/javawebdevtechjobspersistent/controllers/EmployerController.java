package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("employers")
public class EmployerController {

    @Autowired
    private EmployerRepository employerRepository;

    @GetMapping() //displays add employer form at /employers
    public String displayAddEmployerForm(Model model) {
        model.addAttribute(new Employer());
        return "employers/add";
    }

    //lives at /employers/add and displays
    @GetMapping("add")
    public String renderCreateEmployerForm(Model model) {
        model.addAttribute("title", "Add Employer");
        model.addAttribute(new Employer());
        return "employers/add";
    }

    @PostMapping("add") //change per directions - add code to save a valid object
    public String processAddEmployerForm(@ModelAttribute @Valid Employer newEmployer,
                                    Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Employer");
            model.addAttribute("add", newEmployer);
            return "employers/add";
        }
        employerRepository.save(newEmployer);
        return "employers/add";
    }


    @GetMapping("view/{employerId}") // replace
    public String displayViewEmployer(Model model, @PathVariable int employerId) {

        Optional optEmployer = employerRepository.findById(employerId);
        if (optEmployer.isPresent()) {
            Employer employer = (Employer) optEmployer.get();
            model.addAttribute("employer", employer);
            return "employers/view";
        } else {
            return "redirect:../";
        }
    }
}
