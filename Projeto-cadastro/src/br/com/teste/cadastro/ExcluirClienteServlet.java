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
 * Servlet implementation class ExcluirClienteServlet
 */
@WebServlet("/excluirCliente")
public class ExcluirClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try(Connection connection = new ConnectionFactory().novaConexao()){
			ClienteDAO dao = new ClienteDAO(connection);
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);
			dao.excluir(id);
			
			response.sendRedirect("listarClientes");
			
		} catch (Throwable e) {
			e.printStackTrace();
		} 
	}

}
