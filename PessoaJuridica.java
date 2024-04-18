package processo;

public class PessoaJuridica extends Pessoa {

	private final long cnpj;

	private PessoaFisica preposto;

	public PessoaJuridica(String nome, String email, long telefone, long cnpj, PessoaFisica preposto) {
		super(nome, email, telefone);
		this.cnpj = cnpj;
		this.preposto = preposto;
	}

	public PessoaFisica getPreposto() {
		return preposto;
	}

	public void setPreposto(PessoaFisica preposto) {
		this.preposto = preposto;
	}

	public long getCnpj() {
		return cnpj;
	}

	@Override
	public long getCadastroRF() {
		return getCnpj();
	}

}
