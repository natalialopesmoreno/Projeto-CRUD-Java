package br.com.teste.cadastro;

public class Cliente {
	
	private String nome;
	private String profissao;
	private Integer idade;
	private String cidade;
	private String pais;
	private String email;
	private Integer id;
	
	

	public Cliente(String nome, String profissao, int idade, String cidade, String pais, String email) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.cidade = cidade;
		this.pais = pais;
		this.email = email;
		
	}
	

	public Cliente() {
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", profissao=" + profissao + ", idade=" + idade + ", cidade=" + cidade
				+ ", pais=" + pais + ", email=" + email + "]";
	}
	
	
	
	

}
