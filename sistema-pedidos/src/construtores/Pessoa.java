package construtores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public Pessoa(String cpf, String nome, String endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	
	}
}

