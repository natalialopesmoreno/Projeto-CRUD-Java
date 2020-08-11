package br.com.teste.cadastro;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.DAO.ClienteDAO;
import br.com.teste.banco.ConnectionFactory;

/**
 * Servlet implementation class MostraClienteServlet
 */
@WebServlet("/mostraCliente")
public class MostraClienteServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		
		try(Connection connection = new ConnectionFactory().novaConexao()){
			ClienteDAO dao = new ClienteDAO(connection);
			Cliente cliente = new Cliente();
			cliente = (Cliente) dao.buscar(id);
			request.setAttribute("cliente", cliente);
			RequestDispatcher rd = request.getRequestDispatcher("/editarCliente.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		

		
		
		
		
		
	}

	
}
