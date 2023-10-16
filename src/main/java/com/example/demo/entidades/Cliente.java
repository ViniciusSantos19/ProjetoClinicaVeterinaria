package com.example.demo.entidades;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String sobrenome;
	@Column(unique = true) 
	private String email;
	private String telefone;
	@Column(unique = true) 
	private String cpf;
	private Date dataNascimento;
	private boolean ativo =  true;
	@OneToMany
	private List<Animal> pets;
}
