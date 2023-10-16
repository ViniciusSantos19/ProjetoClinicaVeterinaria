package com.example.demo.entidades;

import java.util.List;

import com.example.demo.enums.Especializacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "fornecedores")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String nomeContato;
	private String telefone;
	private String email;
	private String numeroRegistro;
	@OneToMany(mappedBy = "fornecedores")
    private List<Estoque> estoques;
}
