package com.example.demo;

import com.example.demo.entites.Patient;
import com.example.demo.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class DemoApplication {
    PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    @Bean
        public CommandLineRunner start(){
            return args -> {
                patientRepository.save(new Patient(null,"John",true,199));
                patientRepository.save(new Patient(null,"Mary",true,122));
                patientRepository.save(new Patient(null,"John",true,199));
                patientRepository.save(new Patient(null,"Mary",true,122));
                patientRepository.save(new Patient(null,"John",true,199));
                patientRepository.save(new Patient(null,"Mary",true,122));
                patientRepository.save(new Patient(null,"John",true,199));
                patientRepository.save(new Patient(null,"Mary",true,122));

                patientRepository.findAll().forEach(System.out::println);
            };
        }
}
