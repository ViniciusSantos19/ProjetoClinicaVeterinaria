package com.example.demo.entidades;



import com.example.demo.enums.CategoriaEstoque;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "estoques")
public class Estoque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String codigo;
	private String nome;
	private int quantidade;
	@Column(length = 500)
	private String decricao;
	private java.util.Date dataValidade;
	private double precoCompra;
	private double precoVenda;
	@Enumerated(value = EnumType.STRING)
	private CategoriaEstoque categoria;
	private int quantidadeMinima;
	private int quantidadeMaxima;
	@ManyToOne()
	private Fornecedor fornecedor;
	@ManyToOne
    @JoinColumn(name = "localizacao_id")
    private LocalizacaoEstoque localizacao;
	
}
