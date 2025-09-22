package net.elhaddochi.patient_app;

import net.elhaddochi.patient_app.entites.Patient;
import net.elhaddochi.patient_app.reporistory.PatientReporistory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientAppApplication.class, args);
	}
	public CommandLineRunner start(PatientReporistory patientReporistory){
		return args -> {
			
		};
	}

}
