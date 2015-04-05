package empresa;

import java.util.Scanner;
@SuppressWarnings("resource")
public class Main {

	public static void menuPadrao(Empregado empregado){
		Scanner ent = new Scanner(System.in);
		System.out.println("Informe o nome do funcionario:");
		empregado.setNome(ent.nextLine());
		System.out.println("Informe o sobrenome do funcionario:");
		empregado.setSobrenome(ent.nextLine());
		System.out.println("Informe o cpf do funcionario:");
		empregado.setCpf(ent.nextLine());
	}
	
	public static void exibeVencimento(Empregado empregado){
		System.out.println("O vencimento do funcionario "+empregado.getNome()+" "+empregado.getSobrenome()+" cpf: "+empregado.getCpf()+" é = "+empregado.vencimento());
	}

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de empregado\n"
				+ "1-Assalariado\n"
				+ "2-Comissionado\n"
				+ "3-Horista\n");
		int tipoEmpregado = entrada.nextInt();
		
		System.out.println("\n"
				+ "................"
				+ "\n");

		do{
			if(tipoEmpregado == 1){
				Assalariado a = new Assalariado();
				menuPadrao(a);
				System.out.println("Informe o salario do funcionario:");
				a.setSalario(entrada.nextDouble());
				exibeVencimento(a);
			} else if(tipoEmpregado == 2){
				Comissionado c = new Comissionado();
				menuPadrao(c);
				System.out.println("Informe o total de vendas do funcionario:");
				c.setTotalVendas(entrada.nextDouble());
				System.out.println("Informe a taxa de comissao do funcionario:");
				c.setTaxaComissao(entrada.nextDouble());
				exibeVencimento(c);
			} else if(tipoEmpregado == 3){
				Horista h = new Horista();
				menuPadrao(h);
				System.out.println("Informe o total de horas trabalhadas do funcionario:");
				h.setHorasTrabalhadas(entrada.nextDouble());
				System.out.println("Informe o preço por hora do funcionario:");
				h.setPrecoHora(entrada.nextDouble());
				exibeVencimento(h);
			}
		}while(tipoEmpregado > 3 || tipoEmpregado < 1);

		entrada.close();
	}
	
}