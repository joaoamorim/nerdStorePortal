<!DOCTYPE html>
<html>
<head>
<title>NerdStore</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
</head>
<body>
	<h1>NerdStore - Venda de brinquedos para nerds</h1>
	<hr>
	<p>
		Esta é a Nerdstore. A loja melhor amiga dos nerds... :-)<br>
		Faça seu pedido:<br>

	</p>
	<form action="processarPedido" method="post">
		<!--           <form action="compra.html" method="post"> -->
		1- <img src="images/domestico.jpeg" width="50" height="50"
			alt="domestico" /> Robo Domestico -
		Quantidade:<input type="text" name="qdtRoboDomestico" value="0" size="2"><br>

		2-<img src="images/medico.jpeg" width="50" height="50"
			alt="medico" /> Robo Médico -
		Quantidade:<input type="text" name="qdtRoboMedico" value="0" size="2"><br>
		<hr>
		3- <img src="images/seguranca.jpeg" width="50" height="50"
			alt="seguranca" />  Robo Segurança -
		Quantidade:<input type="text" name="qdtRoboSeguranca" value="0" size="2"><br>

		4- <img src="images/ReatorArc.png" width="50"
			height="50" alt="arc" /> Reator Ark -
		Quantidade:<input type="text" name="qdtReatorArk" value="0" size="2"><br>
		<hr>
		5- <img src="images/reatorSolar.jpeg" width="50"
			height="50" alt="arc" /> Reator Ark -
		Quantidade:<input type="text" name="qdtReatorSolar" value="0" size="2"><br><br>

		<hr>
		<br> Informe seus dados para efetuar a compra e para a entrega<br>
		<table>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="nome" size="50"></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="text" name="email" size="50"></td>
			</tr>
			<tr>
				<td>CEP:</td>
				<td><input type="text" name="cep" size="9"></td>
			</tr>
			<tr>
				<td>Número do Cartão:</td>
				<td><input type="text" name="cartao" size="9"></td>
			</tr>
			<tr>
				<td>Vencimento do Cartão:</td>
				<td><input type="text" name="cartaoVenc" size="9"></td>
			</tr>
		</table>

		<hr>
		<input type="submit" value="Realizar Pedido"> <input
			type="reset" value="Cancel">
	</form>

</body>
</html>
