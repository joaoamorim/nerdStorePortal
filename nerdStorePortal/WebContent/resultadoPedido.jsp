<%@page import="java.util.Enumeration"%>
<html>
<head></head>
<body>
<div>
<h1><b>NerdStore</b></h2>
<br />
<br />

<h2><b>Informações do Pedido</b></h2>
<br />
<%@ page import = "java.util.Map" %>
<%
Map<String, String[]> parameters = request.getParameterMap();
for(String parameter : parameters.keySet()) {
	out.println( parameter.toUpperCase() + " : " + request.getParameter(parameter) + "<br />" );    
}
%>

<br />
<h2><b>Resultado do Processamento do Pedido</b></h2>
<br />
<%
Enumeration<String> requestAttributes = request.getAttributeNames();
String nextAttribute = null;
while(requestAttributes.hasMoreElements()){
	nextAttribute = requestAttributes.nextElement();
	System.out.println("Atributo: " + nextAttribute);
	// Print only "user's" parameters
	if(!nextAttribute.toLowerCase().startsWith("javax.servlet")){
		out.println(nextAttribute.toUpperCase() + " : " + request.getAttribute(nextAttribute) + "<br />");
	}
}
%>

<!-- 
Codigo do pedido: < %= request.getAttribute("orderId") %>
<br />
Endereco de entrega: < %= request.getAttribute("clientAddress") %>
<br />
Valor total: < %= request.getAttribute("valorTotal") %>
<br />
-->
<br /><br />
Obrigado por comprar na Nedstore.
<br /><br />
Volte sempre!

</body></html>