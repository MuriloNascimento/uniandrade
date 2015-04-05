package banco;

public class Conta {
	
	private double saldo;
	private double limite;
	private double credito;
	private Cliente dono;

	public Conta() {}
	
	public boolean saca(double valor){
		if(valor > 0 ){
			if(valor <= (this.saldo+this.limite)){
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public void deposita(double valor){
		if(valor > 0){
			this.saldo += valor;
			System.out.println("realizado com sucesso");
		} else {
			System.out.println("impossivel depositar valor negativo ou zero");
		}
	}
	
	public void transfere(Conta beneficiario, double valor){
		beneficiario.deposita(beneficiario.getSaldo()+valor);
		this.saldo -= valor;
	}
	
	public void emprestimo(double valor){
		if(valor < (this.dono.getSalario()*this.credito)){
			this.deposita(this.saldo+valor);
		} else {
			System.out.println("O valor não pode ser maior que o crédito");
		}
	}
	
	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}


}
