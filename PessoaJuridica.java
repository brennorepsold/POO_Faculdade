package escritorio_advocacia;

public class PessoaJuridica extends Pessoa {
	private final long cpnj;
	private PessoaFisica preposto;

	public PessoaJuridica(String nome, String email, String telefone, long cpnj, PessoaFisica preposto) {
		super(nome, email, telefone);
		this.cpnj = cpnj;
		this.preposto = preposto;
	}

	public long getCpnj() {
		return cpnj;
	}

	public PessoaFisica getPreposto() {
		return preposto;
	}

	public void setPreposto(PessoaFisica preposto) {
		this.preposto = preposto;
	}

	@Override
	public long getCadastroRF() {
		// TODO Auto-generated method stub
		return 0;
	}

}
