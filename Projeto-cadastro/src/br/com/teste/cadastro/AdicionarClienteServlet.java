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


@WebServlet("/adicionarCliente")
public class AdicionarClienteServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCliente = request.getParameter("nome");
		String emailCliente = request.getParameter("email");
		String profissaoCliente = request.getParameter("profissao");
		String paisCliente = request.getParameter("pais");
		String cidadeCliente = request.getParameter("cidade");
		String stridade = request.getParameter("idade");
		Integer idadeCliente = Integer.parseInt(stridade);
	
		
		Cliente cliente = new Cliente(nomeCliente, profissaoCliente, idadeCliente, cidadeCliente, paisCliente, emailCliente );
		System.out.println("Cliente cadastrado");
		
		//Ligação com o banco 
		
		try (Connection cf = new ConnectionFactory().novaConexao())
		{
		ClienteDAO cd = new ClienteDAO(cf);
		cd.adicionar(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// Depois que eu criar o pacote do DAO eu vou chamar o método de inserir no banco de dados
		
		System.out.println("Terminando o cadastramento");
		
		//Após inserir eu chamo um método de RequestDispacher 
		//para chamar uma página que mostre os dados(uma lista)
		// Ou response.sendRedirect("listaEmpresas");
		
		response.sendRedirect("listarClientes");
		
		
	}
	}
