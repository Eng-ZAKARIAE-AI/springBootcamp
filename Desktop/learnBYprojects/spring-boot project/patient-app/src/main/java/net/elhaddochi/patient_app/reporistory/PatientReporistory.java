package net.elhaddochi.patient_app.reporistory;

import net.elhaddochi.patient_app.entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientReporistory extends JpaRepository<Patient,Long> {
}
