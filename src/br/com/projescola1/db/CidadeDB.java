package br.com.projescola1.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.projescola.util.ConnectionFactory;
import br.com.projescola1.model.Cidade;

public class CidadeDB {

	
		Connection con;
		PreparedStatement ps;
		
		
		public CidadeDB() {
			con=ConnectionFactory.getConnection();
		
		
	}
public boolean insert(Cidade cidade) {
	
	try {
		StringBuilder sb = new StringBuilder();
		//construtor de strings
		//serve para contatenar string
	
		sb.append("insert into tb_cidade (nome,qtd_habitantes)");
		sb.append(" values(?,?)");
		
		ps=this.con.prepareStatement(sb.toString());
		
		ps.setString(1, cidade.getNome());
		ps.setInt(2, cidade.getQtdhabitantes());
		ps.execute();
		
		return true;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return false;
	
}
	
	
}
