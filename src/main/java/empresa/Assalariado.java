package empresa;

public class Assalariado extends Empregado {
	
	private Double salario;

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Assalariado() {}

	public Assalariado(Double salario) {
		super();
		this.salario = salario;
	}

	@Override
	public Double vencimento() {
		return this.salario;
	}

}
