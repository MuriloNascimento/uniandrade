package debugar;

public class ExecutaCalculo {
	
	private Calculo c;
	
	public int executa(int valor1,int valor2){
		this.c =  new Calculo(valor1, valor2);
		return c.divisao();
	}

	public Calculo getC() {
		return c;
	}

	public void setC(Calculo c) {
		this.c = c;
	}
	
}
