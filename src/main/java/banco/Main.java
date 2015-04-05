package banco;

import java.util.Scanner;

public class Main {
	
	public static void exibeOpcoes(){
		System.out.println("Escolha a opção, ou digite 0 para sair");
		System.out.println("1 = Saldo");
		System.out.println("2 = Saque");
		System.out.println("3 = Deposita");
		System.out.println("4 = Transferência");
		System.out.println("5 = Emprestimo");
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Italo");
		cliente2.setEndereco("av Batel");
		cliente2.setCpf("809088008");
		cliente2.setSalario(6000.00);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Edgar");
		cliente.setEndereco("av Batel");
		cliente.setCpf("809088008");
		cliente.setSalario(1000.00);
		
		Conta conta2 = new Conta();
		conta2.setSaldo(0.00);
		conta2.setLimite(200);
		conta2.setCredito(0.3);
		conta2.setDono(cliente2);
		
		Conta conta = new Conta();
		conta.setSaldo(0.00);
		conta.setLimite(200);
		conta.setCredito(0.3);
		conta.setDono(cliente);
		
		System.out.println(".................................");
		System.out.println("Seja bem vindo "+conta.getDono().getNome());
		System.out.println(".................................");
		
		int opcao = 0;
		do{
			
			exibeOpcoes();
			opcao = entrada.nextInt();
			if(opcao == 1){
				System.out.println("Seu saldo é igual a = "+conta.getSaldo());
				System.out.println("Deseja fazer outra operação:");
				exibeOpcoes();
				opcao = entrada.nextInt();
			} else if (opcao == 2){
				System.out.println("Informe o valor");
				if(conta.saca(entrada.nextDouble()) == true){
					System.out.println("Saque realizado com sucesso");
					System.out.println("Saldo atual = "+conta.getSaldo());
				} else {
					System.out.println("Ocorreu um erro no saque");
				}
			} else if (opcao == 3){
				System.out.println("Informe o valor");
				conta.deposita(entrada.nextDouble());
				System.out.println("Saldo atual = "+conta.getSaldo());
			} else if (opcao == 4){
				System.out.println("Informe o valor a ser transferido");
				conta.transfere(conta2, entrada.nextDouble());
				System.out.println("Saldo atual = "+conta.getSaldo());
				System.out.println("Saldo do cliente "+conta2.getDono().getNome()+" é = "+conta2.getSaldo());
			} else if (opcao == 5){
				System.out.println("Informe o valor que deseja emprestar");
				conta.emprestimo(entrada.nextDouble());
				System.out.println("Saldo atual = "+conta.getSaldo());
			}
			
		}while(opcao != 0);
		
		entrada.close();
	}
}
