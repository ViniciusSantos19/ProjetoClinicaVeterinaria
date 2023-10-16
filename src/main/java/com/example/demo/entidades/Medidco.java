package com.example.demo.entidades;

import com.example.demo.enums.Especializacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "medicos")
public class Medidco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String sobreNome;
	@Enumerated(EnumType.STRING)
	private Especializacao especializacao;
	private String telefone;
	@Column(unique = true) 
	private String email;
	private boolean ativo = true;
	
}
