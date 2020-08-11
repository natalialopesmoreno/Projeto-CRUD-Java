package br.com.teste.DAO;

import java.sql.Connection;

import br.com.teste.banco.ConnectionFactory;
import br.com.teste.cadastro.Cliente;

public class TesteDAOEditar {

	public static void main(String[] args) throws Exception {
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.novaConexao();
		ClienteDAO dao = new ClienteDAO(connection);
		
		
		Cliente cliente = (Cliente) dao.buscar(1);

	}

}
