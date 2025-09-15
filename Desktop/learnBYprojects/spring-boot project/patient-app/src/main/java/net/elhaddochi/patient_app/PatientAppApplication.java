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
			Patient p1=new Patient(null,"zakariae","el haddouchi",100,false);
			Patient p2=new Patient(null,"zakariae","el haddouchi",100,false);
			Patient p3=new Patient(null,"zakariae","el haddouchi",100,false);
			patientReporistory.save(p1);
			patientReporistory.save(p2);
			patientReporistory.save(p3);
			System.out.println("Done");

		};
	}

}
