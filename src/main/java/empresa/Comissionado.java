package empresa;

public class Comissionado extends Empregado {
	
	private Double totalVendas;
	private Double taxaComissao;

	public Double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public Double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(Double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	public Comissionado() {
		// TODO Auto-generated constructor stub
	}

	public Comissionado(Double totalVendas, Double taxaComissao) {
		super();
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	@Override
	public Double vencimento() {
		return this.totalVendas/this.taxaComissao;
	}

}
