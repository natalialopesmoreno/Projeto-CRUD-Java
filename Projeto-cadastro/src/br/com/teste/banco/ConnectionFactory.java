package br.com.teste.banco;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory implements AutoCloseable {

	private DataSource dataSource;
	
	
	public ConnectionFactory() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/cadastro?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setPassword("bibabiba24*");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;	
	}
	

	public Connection novaConexao() throws SQLException {
		return this.dataSource.getConnection();
	}


	@Override
	public void close() throws Exception {
		 ((ConnectionFactory) dataSource).close();
		
	}
	
}
