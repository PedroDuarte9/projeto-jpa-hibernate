package br.com.alura.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity /*Essa anotação será para determinar que a classe é uma entidade*/
@Table(name="produtos") /*Essa anotação será para determinar o nome da tabela no banco*/
public class Produto {
	
	@Id /*Essa anotação será para determinar que se trata do ID*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Essa anotação defini que o id será gerado automáticamente de acordo com a estratégia definida nessa caso foi: GenerationType.IDENTITY*/
	@Column(name = "ID")/*Nome da coluna no Banco de dados*/
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PRECO")
	private BigDecimal preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	

}
