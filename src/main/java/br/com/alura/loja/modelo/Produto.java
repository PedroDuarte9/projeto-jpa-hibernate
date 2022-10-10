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
	

}
