package escritorio_advocacia;

public abstract class Pessoa {
	private final String nome;
	private final String email;
	private final String telefone;

	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

	public abstract long getCadastroRF();

}
