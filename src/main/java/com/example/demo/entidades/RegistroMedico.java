package com.example.demo.entidades;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "registros_medicos")
public class RegistroMedico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private LocalDateTime dataConsulta;
    private String diagnostico;
    private String tratamento;
    private String receita;
    @ManyToOne()
    private Medidco medicoResponsave;
    @ManyToOne
    private Animal paciente;
}
