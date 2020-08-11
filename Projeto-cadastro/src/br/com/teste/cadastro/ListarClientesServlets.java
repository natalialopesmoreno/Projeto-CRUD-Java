package br.com.teste.cadastro;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.DAO.ClienteDAO;
import br.com.teste.banco.ConnectionFactory;

/**
 * Servlet implementation class ListarClientesServlets
 */
@WebServlet("/listarClientes")
public class ListarClientesServlets extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try (Connection connection = new ConnectionFactory().novaConexao())
		{
		ClienteDAO cd = new ClienteDAO(connection);
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes = cd.listar(connection);
		request.setAttribute("clientes", clientes);
		RequestDispatcher rs = request.getRequestDispatcher("/lista.jsp");
		rs.forward(request, response);
//		System.out.println("Listando Clientes");
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
