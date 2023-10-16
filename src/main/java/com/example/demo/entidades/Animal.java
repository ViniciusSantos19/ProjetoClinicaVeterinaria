package com.example.demo.entidades;

import java.util.List;

import com.example.demo.enums.Especie;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pacientes")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private int idade;
	@Enumerated(EnumType.STRING)
	private Especie especie;
	private String raca;
	private char sexo;
	@OneToMany()
    private List<RegistroMedico> historicoMedico;
	private boolean vivo = true;
	@ManyToOne()
	private Cliente dono;
}
