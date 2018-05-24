package br.com.projescola1.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projescola.util.ConnectionFactory;
import br.com.projescola1.model.Aluno;
import br.com.projescola1.model.Cidade;

public class AlunoDB {

	Connection con;
	PreparedStatement ps;
	public AlunoDB() {
		con=ConnectionFactory.getConnection();
	}
	
	public boolean insert(Aluno aluno) {
		
		try {
			StringBuilder sb= new StringBuilder();
			sb.append("insert into tb_aluno (nome,nota,telefone,idcidade)");
			sb.append(" values(?,?,?,?)");
			
			ps=this.con.prepareStatement(sb.toString());
			
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getNota());
		    ps.setString(3, aluno.getTelefone());		
			ps.setInt(4, aluno.getCidade().getId());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
		public List <Aluno> all(){
			List <Aluno> lstAluno = new ArrayList<>();
			String sql = "SELECT a.id, a.nome, a.nota, a.telefone,c.nome FROM TB_ALUNO a, TB_CIDADE c WHERE A.ID=C.ID";
			
			//StringBuilder sb = new StringBuilder ();	
			 
			
			
					
			try {
				ps = this.con.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				
				while (rs.next()) {
					Aluno aluno = new Aluno();
					
					aluno.setId(rs.getInt("a.id"));
					aluno.setNome(rs.getString("a.nome"));
					aluno.setNota(rs.getInt("a.nota"));;
					aluno.setTelefone(rs.getString("a.telefone"));
					aluno.setCidade(new Cidade(rs.getString("c.nome")));
					
					lstAluno.add(aluno);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return lstAluno;
		}
		
		
			
		}
	
