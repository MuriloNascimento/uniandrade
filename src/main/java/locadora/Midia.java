package locadora;

public class Midia {
	
	private int id;
	private String titulo;
	private int diasDevolucao;
	private double preco;
	private String categoria;
	private String descricao;
	
	public Midia(){
		
	}
	
	public Midia(int id, String titulo, int diasDevolucao, double preco, String categoria) {
		this.id = id;
		this.titulo = titulo;
		this.diasDevolucao = diasDevolucao;
		this.preco = preco;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDiasDevolucao() {
		return diasDevolucao;
	}
	public void setDiasDevolucao(int diasDevolucao) {
		this.diasDevolucao = diasDevolucao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
