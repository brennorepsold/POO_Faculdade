package processo;

import java.util.Date;

public class TesteProcesso {

	public static void main(String[] args) {

		System.out.println("Teste Processo");

		PessoaFisica preposto = new PessoaFisica("Jose", "jose@mail", 10002000, 12345);

		PessoaJuridica cliente = new PessoaJuridica("Empresa LTDA", "empresa@mail", 800, 100012345, preposto);

		PessoaFisica parte = new PessoaFisica("Joao", "joao@mail", 20003000, 56789);

		Advogado advogado = new Advogado("Marta", "marta@mail", 40005000, 13579, 90000);

		Tribunal tribunal = new Tribunal("ABC", "Tribunal ABC", "1a Secao");

		Processo processo = new Processo(500010, new Date(), cliente, parte, tribunal);

		processo.addAudiencia(new Date(), "Primeira recomendacao", advogado);
		
		processo.addCusta(new Date(), "Transporte", 150.0);
		processo.addCusta(new Date(), "Cartorio", 13.75);
		
		System.out.println(processo.listar());
	}

}
