package br.com.teste.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.teste.cadastro.Cliente;

public class ClienteDAO {

	private Connection connection;

	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}

	public void adicionar(Cliente cliente) throws SQLException {

		String sql = "INSERT INTO CLIENTES(CLI_NOME,IDADE, PROFISSAO, CIDADE, PAIS, EMAIL)VALUES(?,?,?,?,?,?)";

		try (PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getProfissao());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getPais());
			ps.setString(6, cliente.getEmail());
			ps.execute();

		}
	}

	public List<Cliente> listar(Connection connection) throws SQLException {

		String sql = "SELECT * FROM CLIENTES";
		List<Cliente> clientes = new ArrayList<Cliente>();

		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(rs.getString("cli_nome"));
				cliente.setIdade(rs.getInt("idade"));
				cliente.setEmail(rs.getString("email"));
				cliente.setProfissao(rs.getString("profissao"));
				cliente.setCidade(rs.getString("cidade"));
				cliente.setPais(rs.getString("pais"));
				cliente.setId(rs.getInt("id"));

				clientes.add(cliente);

			}
			rs.close();
		}
		return clientes;

	}

	public void excluir(Integer id) throws Exception {

		String sql = "DELETE FROM CLIENTES WHERE ID = ?";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.execute();
		}

	}

	public void editar(Cliente cliente) throws SQLException {

		String sql = "UPDATE CLIENTES SET CLI_NOME = ?,IDADE = ?, PROFISSAO = ?, CIDADE = ?, PAIS = ?, EMAIL = ?"
				+ " WHERE ID = ?";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, cliente.getNome());
			ps.setInt(2, cliente.getIdade());
			ps.setString(3, cliente.getProfissao());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getPais());
			ps.setString(6, cliente.getEmail());
			ps.setInt(7, cliente.getId());
			ps.execute();

		}
	}

	public Object buscar(Integer id) throws Exception {
		String sql = "SELECT ID, CLI_NOME,IDADE,PROFISSAO,CIDADE, PAIS,EMAIL FROM CLIENTES WHERE ID = ?";

		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, id);
			ps.execute();
			Cliente cliente = new Cliente();
			try (ResultSet rs = ps.getResultSet()) {
				while (rs.next()) {

					cliente.setNome(rs.getString("cli_nome"));
					cliente.setIdade(rs.getInt("idade"));
					cliente.setEmail(rs.getString("email"));
					cliente.setProfissao(rs.getString("profissao"));
					cliente.setCidade(rs.getString("cidade"));
					cliente.setPais(rs.getString("pais"));
					cliente.setId(rs.getInt("id"));

					

				}
			}

			return cliente;
		}
	}
}
