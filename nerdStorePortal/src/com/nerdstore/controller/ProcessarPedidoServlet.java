package com.nerdstore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nerdstore.ConsultaCEP;
import com.nerdstore.ConsultaCEP_Service;
import com.nerdstore.InformacaoCEP;

/**
 * Servlet implementation class TratarPedidoServlet
 */
@WebServlet("/processarPedido")
public class ProcessarPedidoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ConsultaCEP processoCompraService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessarPedidoServlet() {
		super();
		this.processoCompraService = getConsultaCEP();
	}
	
	private ConsultaCEP getConsultaCEP() {
		if (this.processoCompraService == null) {
			this.processoCompraService = new ConsultaCEP_Service().getConsultaCEPSOAP();
		}
		return processoCompraService;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeCliente = request.getParameter("nome");
		String cep = request.getParameter("cep");
		String email = request.getParameter("email");
		String cartao = request.getParameter("cartao");
		String cartaoVenc = request.getParameter("cartaoVenc");

		String qtdeRoboDomestico = (request.getParameter("qdtRoboDomestico")); // Robo Domestico Ark
		String qtdeRoboMedico = (request.getParameter("qdtRoboMedico")); // Robo Domestico Solar
		String qtdeRoboSeguranca = (request.getParameter("qdtRoboSeguranca")); // Robo Seguranca Ark
		String qtdeReatorArk = (request.getParameter("qdtReatorArk")); // Robo Seguranca Solar
		String qtdeReatorSolar = (request.getParameter("qdtReatorSolar")); // Robo Medico Ark
		
		// FIXME: Comentar para passar, enquanto não for possível chamar o serviço BPEL na máquina do Rafael
		InformacaoCEP confirmacaoPedido = getConsultaCEP().consultarCEP(cep, nomeCliente, email, cartao, cartaoVenc,
				qtdeReatorArk, qtdeReatorSolar, qtdeRoboMedico, qtdeRoboSeguranca, qtdeRoboDomestico);	
		
//		// FIXME: MOCK TO PASS
//		InformacaoCEP confirmacaoPedido = null;
//		confirmacaoPedido = new InformacaoCEP();
//		confirmacaoPedido.setBrRobotic("1");
//		confirmacaoPedido.setBrRobotic1("2");
//		confirmacaoPedido.setBrRobotic2("3");
//		confirmacaoPedido.setCep(cep);
//		confirmacaoPedido.setEndereco("Rua " + System.currentTimeMillis());
//		confirmacaoPedido.setEstado("SC");
//		confirmacaoPedido.setNewElement("Element " + System.currentTimeMillis());
//		confirmacaoPedido.setNewElement1("Element 1 " + System.currentTimeMillis());
//		confirmacaoPedido.setNewElement2("Element 2 " + System.currentTimeMillis());
//		confirmacaoPedido.setNewElement3("Element 3 " + System.currentTimeMillis());
//		// FIXME: MOCK TO PASS
		
		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		out.write("Solicitação do cliente: " + nomeCliente + "\n");
		
		out.write("\n\nResultado:\n\n");
		
		if(confirmacaoPedido == null){
			out.write("Pedido não efetivado.\n\n");
			out.write("Favor tentar novamente.\n");
		}
		else{
			out.write("Resposta: \n\n" + confirmacaoPedido.toString() + "\n");
			out.write("\n\nObrigado por comprar na Nedstore.\n\n");
			out.write("Volte sempre.\n");
						
			// Verificar com o Rafael o novo nome dos parâmetros retornados 
			request.setAttribute("brRobotic", confirmacaoPedido.getBrRobotic());
			request.setAttribute("brRobotic1",confirmacaoPedido.getBrRobotic1());
			request.setAttribute("brRobotic2",confirmacaoPedido.getBrRobotic2());
			request.setAttribute("cep",confirmacaoPedido.getCep());
			request.setAttribute("endereco",confirmacaoPedido.getEndereco());
			request.setAttribute("estado",confirmacaoPedido.getEstado());
			request.setAttribute("newElement",confirmacaoPedido.getNewElement());
			request.setAttribute("newElement1",confirmacaoPedido.getNewElement1());
			request.setAttribute("newElement2",confirmacaoPedido.getNewElement2());
			request.setAttribute("newElement3",confirmacaoPedido.getNewElement3());

		    RequestDispatcher rd = request.getRequestDispatcher("/resultadoPedido.jsp");
		    rd.forward(request, response);
		}	   
	}

	@SuppressWarnings("unused")
	private int toInt(String s) {
		try {
			return Integer.valueOf(s);
		} catch (NumberFormatException e) {
			return 0;
		}

	}

}
