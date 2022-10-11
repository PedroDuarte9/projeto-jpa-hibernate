package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Produto;

/*O único objetivo desta classe é fazer a ligação com o banco de dados*/
public class ProdutoDao {
	private EntityManager em; //Defini o EntityManager como atributo

	public ProdutoDao(EntityManager em) { //Fiz um construtor
		this.em = em;
	}
	
	public void cadastrar(Produto produto) { //Aqui é um método simples apenas para receber o EntityManager
		this.em.persist(produto);
	}
	
	
}
