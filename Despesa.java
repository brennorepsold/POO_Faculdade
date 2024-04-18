package processo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Despesa {

	private final Date data;
	private final String descricao;
	private final double valor;

	public Despesa(Date data, String descricao, double valor) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		return sdf.format(getData()) + " " + getDescricao() + " " + getValor();
	}

	
}
