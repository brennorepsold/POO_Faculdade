package processo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Processo {

	private final long numero;
	private final Date dataAbertura;

	private EFaseProcesso fase;

	private Pessoa cliente;
	private Pessoa parteContraria;

	private Tribunal tribunal;

	private ArrayList<Audiencia> audiencias = new ArrayList<>();
	private ArrayList<Despesa> custas = new ArrayList<>();

	public Processo(long numero, Date dataAbertura, Pessoa cliente, Pessoa parteContraria, Tribunal tribunal) {
		super();

		this.numero = numero;
		this.dataAbertura = dataAbertura;

		this.fase = EFaseProcesso.INICIAL;

		this.cliente = cliente;
		this.parteContraria = parteContraria;

		this.tribunal = tribunal;
	}

	public EFaseProcesso getFase() {
		return fase;
	}

	public void setFase(EFaseProcesso fase) {
		this.fase = fase;
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

	public Tribunal getTribunal() {
		return tribunal;
	}

	public void setTribunal(Tribunal tribunal) {
		this.tribunal = tribunal;
	}

	public long getNumero() {
		return numero;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void addAudiencia(Date data, String recomendacao, Advogado advogado) {
		audiencias.add(new Audiencia(data, recomendacao, advogado));
	}
	
	public void addCusta(Date data, String descricao, double valor) {
		custas.add(new Despesa(data, descricao, valor));
	}
	
	public String getAudiencias() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Audiencia audiencia : audiencias) {
			sb.append("\n");
			sb.append(audiencia.toString());
		}
		
		return sb.toString();
	}
	
	public String getCustas() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Despesa custa : custas) {
			sb.append("\n");
			sb.append(custa.toString());
		}
		
		return sb.toString();
	}
	
	public double getTotalCustas() {

		double total = 0.0;
		
		for (Despesa custa : custas) {
			total += custa.getValor();
		}
		
		return total;
	}
	
	public String listar() {
		
		StringBuilder sb = new StringBuilder();

		sb.append(this.toString());
		
		sb.append("\n\nAudiências");
		sb.append(this.getAudiencias());

		sb.append("\n\nCustas do Processo");
		sb.append(this.getCustas());
		
		sb.append(String.format("\n\nTotal das custas: %.2f", this.getTotalCustas()));
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		sb.append("\nNúmero do Processo: " + getNumero());
		sb.append("\nData de Abertura  : " + sdf.format(getDataAbertura()));
		sb.append("\nFase do Processo  : " + getFase());
		
		sb.append("\n");
		sb.append("\nCliente        : " + getCliente().getNome());
		sb.append("\nParte Contraria: " + getParteContraria().getNome());
		
		sb.append("\n");
		sb.append("\nTribunal: " + getTribunal().getDescricao());		
		
		return sb.toString();
	}
	
}
