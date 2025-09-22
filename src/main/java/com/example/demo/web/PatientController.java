package com.example.demo.web;


import com.example.demo.entites.Patient;
import com.example.demo.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class PatientController {
    PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "p", defaultValue = "0") int page,
                        @RequestParam(name = "s", defaultValue = "5") int size) {
        Page<Patient> listeDesPatient = patientRepository.findAll(PageRequest.of(page, size));

        model.addAttribute("listeDesPatient", listeDesPatient.getContent());
        model.addAttribute("Pages", new int[listeDesPatient.getTotalPages()]); // 👈 fix
        model.addAttribute("currentPage", page);

        return "Patients";
    }


}
