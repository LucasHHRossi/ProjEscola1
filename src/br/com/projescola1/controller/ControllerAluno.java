package br.com.projescola1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projescola1.model.Aluno;


@WebServlet("/ControllerAluno")
public class ControllerAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ControllerAluno() {
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<title>");
			out.print(" Meu Servlet ");
			out.print("</title>");
			out.print("<head>");
			out.print("</head>");
			out.print("<body>");
			out.print(" Meu Servlet!");
			out.print("</body>");
			out.print("</html>");
			
			int idCidade = 
					Interger.parsetInt(request.getParameter("idCidade"));
					Aluno a = new Aluno();
					Cidade c = new Cidade();
					a.setCidade(new Cidade(idCidade));
	}
}
