package br.com.teste.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.teste.banco.ConnectionFactory;
import br.com.teste.cadastro.Cliente;

public class TesteDAOBuscar {

	public static void main(String[] args) throws Throwable {
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.novaConexao();
		ClienteDAO dao = new ClienteDAO(connection);
		
		
		Cliente cliente = (Cliente) dao.buscar(10);
		
		System.out.println(cliente);

	}

}
