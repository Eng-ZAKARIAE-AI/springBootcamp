package net.elhaddochi.patient_app.entites;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PATIENTS")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String prenom;
    private int score;
    private boolean malade;
}
