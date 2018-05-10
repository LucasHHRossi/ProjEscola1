package br.com.projescola.teste;

import br.com.projescola1.db.CidadeDB;
import br.com.projescola1.model.Cidade;

public class CidadeTest {

	public static void main(String[]args) {
		Cidade c =new Cidade();
		c.setNome("Taquaritinga");
		c.setQtdhabitantes(200000);
		
		if(new CidadeDB().insert(c)){
		System.out.println("Registro Inserido");
		
	}else {
		System.out.println("Erro ao Inserir Registro");
	}
}
}