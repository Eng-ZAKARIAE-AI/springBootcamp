package net.elhaddochi.patient_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import net.elhaddochi.patient_app.reporistory.PatientReporistory;

@Controller
public class PatientController {
    @Autowired
    PatientReporistory patientReporistory;

    @GetMapping("/index")
    public String index(){
        return "hello";
    }
}