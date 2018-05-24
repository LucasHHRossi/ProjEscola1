package br.com.projescola.teste;

import br.com.projescola1.db.CidadeDB;
import br.com.projescola1.model.Cidade;

public class cidadeconsutateste {
	
	public static void main (String[]args) {
		
		for (Cidade cidade : new CidadeDB().all()) {
			System.out.println("Id  :"+cidade.getId());
			System.out.println("Nome  :"+cidade.getNome());
			System.out.println("Qtd_habitantes: "+cidade.getQtdhabitantes());
		}
	}

}
