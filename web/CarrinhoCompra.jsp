<%-- 
    Document   : Carrinho
    Created on : 15/05/2019, 22:56:16
    Author     : julio
--%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Random"%>
<%@page import="com.util.Calculadora"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Carrinho de Compras</title>
        <div class="container">
  <h2>Carrinho de Compras</h2>
  <p>Lista de produtos selecionados :</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Nome do Produto</th>
        <th>valor do Produto</th>
        <th>Imagem do Produto</th>
      </tr>
      </thead>
    <tbody>
    

        <%
        ArrayList lista = new ArrayList();
        lista = (ArrayList) session.getAttribute("lista");
 	int valores = 0;
        NumberFormat formatter = new DecimalFormat("0.00");
        float valorTotal = 0;
        Random random = new Random();
        int chaveVenda = random.nextInt(100);
        for(int a = 0 ; a < lista.size();a++){
    String produtosComprados = lista.get(a).toString();
if(produtosComprados.startsWith("&"))
{
    String[] variavel = produtosComprados.split("&");   
    //valores = valores + Calculadora.Conversor(variavel[2]);
    valorTotal = valorTotal + Float.parseFloat(variavel[2].replace(",", "."));
    
%>
<tr>
    <td><%=variavel[1]%></td>
    <td><%=variavel[2]%></td>
    <td><img src="Photo/<%=variavel[3]%>.jpg"width="70" height="70"></td>       
<%        
} 	
}%>
    </tr>
    
    <tr>
    <th>Protocolo de Venda</th>
    <th>VALOR TOTAL DE SUAS COMPRAS</th>
    <th>USUARIO</th>
    </tr>
        
    <tr>
        <td><%=chaveVenda%></td>
        <td>Valor em Reais R$ <%=formatter.format(valorTotal)%></td>
        <th><%=request.getAttribute("usuario")%></th>
    </tr>    
    
  </tbody>
  </table>
    <p><button><a href="index.jsp" type="button" border-radius:15px>Retornar</a></button></p>
    <p><a class="btn btn-secondary" href="CarrinhoServlet?action=deslogar&user=deslogar" role="button"><<-- DESLOGAR </a></p>
    </div>
</body>
    </body>
</html>