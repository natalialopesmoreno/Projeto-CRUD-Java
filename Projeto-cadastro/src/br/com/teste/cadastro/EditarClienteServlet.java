package br.com.teste.cadastro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.teste.DAO.ClienteDAO;
import br.com.teste.banco.ConnectionFactory;

/**
 * Servlet implementation class EditarClienteServlet
 */
@WebServlet("/editarCliente")
public class EditarClienteServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nomeCliente = request.getParameter("nome");
		String paramIdade = request.getParameter("idade");
		String profissao = request.getParameter("profissao");
		String cidade = request.getParameter("cidade");
		String pais = request.getParameter("pais");
		String email = request.getParameter("email");
		Integer idade = Integer.valueOf(paramIdade);
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Cliente cliente = new Cliente(nomeCliente, profissao, idade, cidade, pais, email);
		cliente.setId(id);
		
		try(Connection connection = new ConnectionFactory().novaConexao()){
			ClienteDAO dao = new ClienteDAO(connection);
			dao.editar(cliente);
			System.out.println("Cliente Editado");
			response.sendRedirect("listarClientes");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		}
		
	}

