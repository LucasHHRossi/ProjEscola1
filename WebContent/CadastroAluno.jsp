<%@page import="br.com.projescola1.db.AlunoDB"%>
<%@page import="br.com.projescola1.model.Aluno"%>
<%@page import="br.com.projescola1.db.CidadeDB"%>
<%@page import="br.com.projescola1.model.Cidade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alunos</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />

</head>
<body>


<h1> Cadastro de Aluno </h1>




<form action="ControllerAluno" method="post">

<div class ="col-sm-6">
<%if(request.getAttribute("msg")!=null){%>
<div class = "alert-primary"role="alert">
<%=request.getAttribute("msg")%>
</div>
<%} %>


<div class ="col-sm-3">
<div class = "form-group">
<label>Nome: </label>
<input type="text" id="nome" name="nome" /> 
</div>

<div class="form-group">
<label>Telefone:</label>
<input type="text" id="telefone" name="telefone" />
</div>

<div class="form-group">
    <label for="selectCidade">Cidade</label>
    <select class="form-control" id="selectCidade" 
    name ="selectCidade">
    
     <option>Selecione</option>
    <% for (Cidade cidade : new CidadeDB().all()){ %>
      <option value="<%=cidade.getId()%>"><%=cidade.getNome() %>"</option>
    <%} %>
    </select>
  </div>


<div class="form-group">
<label>Nota: </label>
<input type="number" id="nota" name="nota" />
</div>

<input type="submit" class="btn btn-primary" value="Salvar" />
</div>
</form>


<br>
<div class ="col-sm-6">
<table class="table table-dark">
  <thead>
    <tr>
    
      <th scope="col">Id</th>
      <th scope="col">Nome</th>
      <th scope="col">Nota</th>
      <th scope="col">Telefone</th>
      <th scope="col">Cidade</th>
    </tr>
  </thead>
  <tbody>
  
  <% for(Aluno aluno : new AlunoDB().all()){
	  %>
  
    <tr>
      <td scope="row"><%=aluno.getId() %></td>
      <td><%=aluno.getNome() %></td>      
      <td><%=aluno.getNota() %></td>
      <td><%=aluno.getTelefone() %></td>        
      <td><%=aluno.getCidade().getNome() %></td>
      
      
    </tr>
 <%} %>
  </tbody>
</table>
</div>

<br>

<a href="Principal.jsp">Voltar</a>
</body>
</html>