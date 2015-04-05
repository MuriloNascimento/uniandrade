package locadora;

import java.util.Calendar;
import java.util.List;

public class Locacao {
	
	private int id;
	private Cliente cliente;
	private List<Item> itens;
	private Calendar dataInicio;

	public Locacao(int id, Cliente cliente, List<Item> itens, Calendar dataInicio) {
		this.id = id;
		this.cliente = cliente;
		this.itens = itens;
		this.dataInicio = dataInicio;
	}

	public Locacao() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

}
