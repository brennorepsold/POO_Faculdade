package escritorio_advocacia;

public class PessoaFisica extends Pessoa {
	private final long cpf;

	public PessoaFisica(String nome, String email, String telefone, long cpf) {
		super(nome, email, telefone);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	@Override
	public long getCadastroRF() {
		// TODO Auto-generated method stub
		return 0;
	}

}
