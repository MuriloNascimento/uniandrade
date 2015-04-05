package empresa;

public class Horista extends Empregado {
	
	private Double precoHora;
	private Double horasTrabalhadas;
	
	public Double getPrecoHora() {
		return precoHora;
	}
	
	public void setPrecoHora(Double precoHora) {
		this.precoHora = precoHora;
	}

	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public Double vencimento() {
		return this.horasTrabalhadas * precoHora;
	}

	public Horista(Double precoHora, Double horasTrabalhadas) {
		super();
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public Horista() {
	}

}
