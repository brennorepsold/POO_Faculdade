package escritorio_advocacia;

import java.util.ArrayList;
import java.util.Date;

public class Processo {
	private final long numero;
	private final Date dataAbertura;
	private EfaseProcesso fase;

	private Tribunal tribunal;
	private Pessoa cliente;
	private Pessoa parteContraria;

	private ArrayList<Audiencia> audiencias = new ArrayList<>();
	private ArrayList<Despesa> custas = new ArrayList<>();

	public Processo(long numero, Date dataAbertura, Tribunal tribunal, Pessoa cliente, Pessoa parteContraria) {
		this.numero = numero;
		this.dataAbertura = dataAbertura;

		this.fase = EfaseProcesso.INICIAL;

		this.tribunal = tribunal;
		this.cliente = cliente;
		this.parteContraria = parteContraria;

	}

	public EfaseProcesso getFase() {
		return fase;
	}

	public void setFase(EfaseProcesso fase) {
		this.fase = fase;
	}

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Pessoa getParteContraria() {
		return parteContraria;
	}

	public void setParteContraria(Pessoa parteContraria) {
		this.parteContraria = parteContraria;
	}

	public long getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public String getAudiencias() {
		StringBuilder sb = new StringBuilder();
		for (Audiencia x : audiencias) {
			sb.append("/n");
			sb.append(x.getRecomendacao());
		}
		return sb.toString();
	}

	public void addAudiencia(Date data, String recomendacao, Advogado advogado) {
		audiencias.add(new Audiencia(data, recomendacao, advogado));
	}

	public String getCustas() {
		StringBuilder sb = new StringBuilder();
		for (Despesa x : custas) {
			sb.append("/n");
			sb.append(x.getDescricao());
		}
		return sb.toString();
	}

	public void addCustas(Date data, String recomendacao, double valor) {
		custas.add(new Despesa(data, recomendacao, valor));
	}

	public double getTotalCustas() {
		double total = 0;
		for (Despesa x : custas) {
			total += x.getValor();
		}
		return total;

	}

	@Override
	public String toString() {
		return " ";
	}

}
