package construtores;

public class SistemaDeCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("116.555.726-60", "Pedro Souza", "Rua G");
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf() +" " +  marcos.getEndereco());
	}
}

