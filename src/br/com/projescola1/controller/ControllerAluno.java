package br.com.projescola1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projescola1.db.AlunoDB;
import br.com.projescola1.model.Aluno;
import br.com.projescola1.model.Cidade;


@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ControllerAluno() {
   super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
	int idCidade = Integer.parseInt(request.getParameter("selectCidade"));
		
		String nome = request.getParameter("nome");
		String telefone= request.getParameter("telefone");
		int nota=Integer.parseInt(request.getParameter("nota"));
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setTelefone(telefone);
		aluno.setNota(nota);
		aluno.setCidade(new Cidade(idCidade));
		
		
		if(new AlunoDB().insert(aluno)) {
			request.setAttribute("msg", "Registro Inserido com sucesso!");
			request.getRequestDispatcher("CadastroAluno.jsp").forward(request, response);
			
		}else {
			request.setAttribute("msg", "Erro ao Inserir Registro!");
			request.getRequestDispatcher("CadastroAluno.jsp").forward(request, response);
		}
			
			
			
			
	}
}
