package br.com.teste.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.teste.banco.ConnectionFactory;
import br.com.teste.cadastro.Cliente;

public class TesteDao {

	public static void main(String[] args) throws Exception {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection cc = cf.novaConexao();
		
//		//Cliente cliente1 = new Cliente("Matheus","Professor", 27 , "Sao Paulo", "Brasil" );
//		
//		ClienteDAO cd = new ClienteDAO(cc);
//		cd.adicionar(cliente1);
//		System.out.println("Operação realizada com sucesso!");
//		
//		cc.close();
//		cf.close();
		
	}

}
