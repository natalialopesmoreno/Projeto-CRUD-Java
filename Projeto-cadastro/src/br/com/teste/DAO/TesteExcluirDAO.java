package br.com.teste.DAO;

import java.sql.Connection;

import br.com.teste.banco.ConnectionFactory;

public class TesteExcluirDAO {

	public static void main(String[] args) throws Throwable {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.novaConexao();
		ClienteDAO dao = new ClienteDAO(connection);
		
		dao.excluir(3);
		System.out.println("Cliente Excluido");

	}

}
