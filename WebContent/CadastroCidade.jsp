<%@page import="br.com.projescola1.db.CidadeDB"%>
<%@page import="br.com.projescola1.model.Cidade"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cidade</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" />
</head>
<body>

<h1>Cadastro de Cidades</h1>


<form action="ControllerCidade" method="post">

<div class ="col-sm-6">
<%if(request.getAttribute("msg")!=null){%>
<div class = "alert-primary"role="alert">
<%=request.getAttribute("msg")%>
</div>
<%} %>



<div class="form-group">
<label>Nome:</label>
<input type="text" id="nome" name="nome"/>
</div>


<div class ="form-group">
<label>Qtd. Habitantes:</label>
<input type="number" id="qtdhabitantes" name="qtdhabitantes" />
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
      <th scope="col">Qtd. Habitantes</th>
     
    </tr>
  </thead>
  <tbody>
  
  <% for(Cidade cidade : new CidadeDB().all()){
	  %>
  
  
    <tr>
      <td scope="row"><%=cidade.getId() %></td>
      <td><%=cidade.getNome() %></td>
      <td><%=cidade.getQtdhabitantes() %></td>
      
    </tr>
 <%} %>
  </tbody>
</table>
</div>
<a href="Principal.jsp">Voltar</a>

</body>
</html>