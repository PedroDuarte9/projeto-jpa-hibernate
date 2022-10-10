package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Produto;

public class CadastroDeProdutos {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.setNome("Nokia");
		celular.setDescricao("Smartphone");
		celular.setPreco(new BigDecimal("500"));
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja"); 
		
		EntityManager em = emf.createEntityManager();
		
		ProdutoDao dao = new ProdutoDao(em); //Aqui foi instaciada a classe ProdutoDao para receber a persistencia do objeto
		
		em.getTransaction().begin();// em pega a transação e inicia a transação 
		
		em.persist(celular);
		
		em.getTransaction().commit();
		
		em.close();
	}

}



