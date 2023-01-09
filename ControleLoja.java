package estoqueLoja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {

	public static void main(String[] args) {
		
		//para indicar o tipo de dados na lista
		List<String> estoque = new ArrayList<String>();
		
		//para adicionar na lista
		estoque.add("Camiseta");
		estoque.add("Calção");
		estoque.add("Tênis");
		estoque.add("Sapato");
		
		//mostrando os itens
		System.out.println("Listagem de itens do estoque " + estoque);
	
		//atualizar item da lista usando remover
		//da para remover usando o indice também.
		estoque.remove("Camiseta");
		estoque.add("Coturno");
		
		System.out.println("Listagem de itens em estoque atualisados " + estoque);
		
		estoque.remove(1);
		estoque.add("Sapatenis");
		
		System.out.println("Listagem de itens em estoque atualisados " + estoque);
	
	//essa função tbm é conhecido como crud.
	
	//editando um item da lista buscando pelo nome.
		estoque.set(estoque.indexOf("Calção"), "Short");
		System.out.println("Listagem de itens atualizado " + estoque);
	
	}

}
