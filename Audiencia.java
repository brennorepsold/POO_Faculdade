package processo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Audiencia {

	private final Date data;
	private final String recomendacao;

	private final Advogado advogado;

	public Audiencia(Date data, String recomendacao, Advogado advogado) {
		super();
		this.data = data;
		this.recomendacao = recomendacao;
		this.advogado = advogado;
	}

	public Date getData() {
		return data;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	@Override
	public String toString() {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		return sdf.format(getData()) + " " + getRecomendacao();
	}
	
	

}
