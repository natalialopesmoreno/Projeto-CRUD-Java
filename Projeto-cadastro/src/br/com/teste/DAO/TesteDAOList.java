package br.com.teste.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.teste.banco.ConnectionFactory;
import br.com.teste.cadastro.Cliente;

public class TesteDAOList {

	public static void main(String[] args) throws Exception {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.novaConexao();
		ClienteDAO dao = new ClienteDAO(connection);
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes = dao.listar(connection);
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
			
		}
		

	}

}
