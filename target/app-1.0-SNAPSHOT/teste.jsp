<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>



<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="br.com.fabricadapizzace.model.Cliente" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
<%--    <link rel="stylesheet" type="text/css" href="css/buttons.css" media="screen" />--%>
</head>
<body>

<% List<Cliente> listaDeClientes = (List<Cliente>) request.getAttribute("listadeclientes");%>

<table>
    <thead>
    <tr>
        <th>id</th>
        <th>nome</th>
        <th>telefone</th>
        <th>Taxa de entrega</th>
    </tr>
    </thead>
    <tbody>
    <% for(Cliente cliente : listaDeClientes){%>

    <tr>
        <td><%= cliente.getId() %></td>
        <td><%= cliente.getNome() %></td>
        <td><%= cliente.getTelefone() %></td>
        <td><%= cliente.getTaxaEntrega() %></td>
<%--        <td><a href=""><button class="custom-btn btn-3"><span>Visualizar</span></button></a></td>--%>
<%--        <td><a href="alunoporid?id=<%= aluno.getId()%>"><button class="custom-btn btn-4"><span>Editar</span></button></a></td>--%>
<%--        <td><a href="excluir?id=<%= aluno.getId()%>"><button class="custom-btn btn-2"><span>Excluir</span></button></a></td>--%>
    </tr>



    <%}%>
    </tbody>
    <tfoot>
    <tr>
<%--        <td colspan="9"><a href="formulario.html"><button class="custom-btn btn-1"><span>Adicionar</span></button></a></td>--%>
    </tr>
    </tfoot>
</table>


</body>
</html>