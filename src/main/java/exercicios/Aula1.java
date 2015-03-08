package exercicios;

import java.util.Scanner;

public class Aula1 {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void exercicio1(){
		
		//le o primeiro valor
		System.out.println("Informe o primeiro valor");
		int valor1 = entrada.nextInt();
		//le o segundo valor
		System.out.println("Informe o segundo valor");
		int valor2 = entrada.nextInt();
		//subtrai do maior sobre o menor
		if(valor2 > valor1){
			System.out.println("O resultado é: "+(valor2-valor1));
		} else {
			System.out.println("O resultado é: "+(valor1-valor2));
		}
		
	}
	
	public static void exercicio2(){
		//le o valor
		System.out.println("Informe o valor");
		int valor1 = entrada.nextInt();
		//multiplica por -1
		System.out.println("O resultado é: "+(valor1*-1));
	}
	
	public static void exercicio3(){
		
		double nota[] = new double[4];
		//le todas as notas
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Informe a nota "+(i+1));
			nota[i] = entrada.nextDouble();
			while(nota[i] < 0){
				System.out.println("nota não pode ser menor que 0");
				System.out.println("Informe a nota "+(i+1));
				nota[i] = entrada.nextDouble();
			}
			
		}
		//calcula a média
		double media = (nota[0]+nota[1]+nota[2]+nota[3])/4;
		//imprime aprovado se for maior que 5 a média
		if(media >= 5){
			System.out.printf("Aprovado, média final: %.1f",media);
		} else {
			System.out.printf("Reprovado, média final: %.1f",media);
		}

	}
	
	public static void exercicio4(){
		
		double nota[] = new double[4];
		//le todas as notas
		for (int i = 0; i < nota.length; i++) {
			do{
				System.out.println("Informe a nota "+(i+1));
				nota[i] = entrada.nextDouble();
			} while(nota[i] < 0);
		}
		//calcula a média
		double media = (nota[0]+nota[1]+nota[2]+nota[3])/4;
		//imprime aprovado se for maior que 5 a média
		if(media >= 7){
			System.out.printf("Aprovado, média final: %.1f",media);
		} else {
			//pede a nota do exame final
			double exameFinal;
			do{
				System.out.println("nota não pode ser menor que 0");
				System.out.println("Informe a nota do exame final");
				exameFinal = entrada.nextDouble();
			} while (exameFinal < 0);
			//calcula a media final
			double mediaFinal = (exameFinal+media)/2;
			//se a media for maior que 5 esta aprovado se nããão....
			if(mediaFinal >= 5){
				System.out.printf("Aprovado em exame, média final: %.1f",mediaFinal);
			} else {
				System.out.printf("Reprovado, média final: %.1f",mediaFinal);
			}
		}
	}
	
	public static void exercicio5(){
		//le o valor de a
		System.out.println("Informe o valor de a");
		int a = entrada.nextInt();
		//le o valor de b
		System.out.println("Informe o valor de b");
		int b = entrada.nextInt();
		//le o valor de c
		System.out.println("Informe o valor de c");
		int c = entrada.nextInt();
		//calcula o delta
		double delta = b*b - 4*a*c;
		//calcula o x1 e x2
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		//imprime o resultado
		if(delta < 0){
			System.out.println("A equacao nao possui raizes reais.");
		} else if (delta == 0){
			System.out.println("O valor de x1 e x2 é igual a "+x1);
		} else {
			System.out.println("O valor de x1 é "+x1);
			System.out.println("O valor de x2 é "+x2);
		}
	}
	
	public static void exercicio6(){
		double valores[] = new double[4];
		//le todos os valores:
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe o valor "+(i+1));
			valores[i] = entrada.nextInt();
		}
		//imprime os divisiveis por 2 e 3
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] % 2 == 0 && valores[i] % 3 == 0){
				System.out.println(valores[i]);
			}
		}
	}
	
	public static void exercicio7(){
		double valores[] = new double[4];
		//le todos os valores:
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe o valor "+(i+1));
			valores[i] = entrada.nextInt();
		}
		//imprime os divisiveis por 2 ou 3
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] % 2 == 0 || valores[i] % 3 == 0){
				System.out.println(valores[i]);
			}
		}
	}
	
	public static void exercicio8(){
		//le o valores:
		System.out.println("Informe um valor");
		int valor = entrada.nextInt();
		//verifica se é par impar ou zero
		if(valor == 0){
			System.out.println("zero não é par nem impar");
		} else {
			if(valor % 2 == 0){
				System.out.println(valor+" é par");
			} else {
				System.out.println(valor+" é impar");
			}
		}
	}
	
	public static void exercicio9(){
		//le o valores:
		System.out.println("Informe um valor");
		int valor = entrada.nextInt();
		//verifica se o valor está na faixa permitida
		if(valor > 0 && valor < 10){
			System.out.println("O valor está na faixa permitida");
		} else {
			System.out.println("O valor informado não pertence a faixa de 1 a 9");
		}
	}
	
	public static void exercicio10(){
		//le o nome:
		System.out.println("Informe seu nome");
		String nome = entrada.nextLine();
		//le o sexo:
		System.out.println("Informe seu sexo");
		String sexo = entrada.nextLine();
		//verifica o sexo e exibe a mensagem
		if(sexo.equals("Feminino") || sexo.equals("feminino") ){
			System.out.println("Ilma. Sra. "+nome);
		} else if(sexo.equals("Masculino") || sexo.equals("masculino")){
			System.out.println("Ilmo. Sr. "+nome);
		} else {
			System.out.println("Sexo inválido");
		}
	}
	
	public static void exercicio11(){
		//le o numero:
		System.out.println("Informe um numero qualquer");
		int numero = entrada.nextInt();
		//imprime a tabuada do mesmo
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero+" x "+i+" = "+ (numero * i) );
		}
	}
	
	public static void exercicio12(){
		//imprime a soma dos numeros inteiros até 100
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma = soma + i;
		}
		System.out.println("O resultado é: "+soma);
	}

	public static void exercicio13(){
		//imprime a soma dos numeros inteiros até 100 que sejam pares
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0){
				soma = soma + i;
			}
		}
		System.out.println("O resultado é: "+soma);
	}
	
	public static void exercicio14(){
		//imprime os valores impares entre 0 e 20
		for (int i = 0; i <= 20; i++) {
			if(i % 2 != 0){
				System.out.println(i);
			}
		}
	}
	
	public static void exercicio15(){
		//imprime os valores divisiveis por 4 até 200
		for (int i = 1; i <= 200; i++) {
			if(i % 4 == 0){
				System.out.println(i);
			}
		}
	}
	
	public static void exercicio16(){
		//Apresentar os resultados das potencias de 3, variando do expoente 0 ate o expoente 15
		for (int i = 0; i <= 15; i++) {
			System.out.println("Base 3 expoente "+i+" = "+Math.pow(3,i));
		}
	}
	
	public static void exercicio17(){
		//le a base:
		System.out.println("Informe uma base");
		int b = entrada.nextInt();
		//le a base:
		System.out.println("Informe um expoente");
		int e = entrada.nextInt();
		//imprime o resultado do calculo verificando se é positivo
		if(b >= 0 && e >= 0){
			System.out.println(Math.pow(b, e));
		} else {
			System.out.println("Os valores devem ser positivo");
		}
	}
	
	public static void exercicio18(){
		int atual = 1, anterior = 0;
        //imprime o primeiro valor
        System.out.println(atual);
        //calcula e apresenta a serie de fibonacci
        for(int i = 0; i <= 15; i++){
        	atual = atual + anterior;
        	anterior = atual - anterior;
            System.out.println(atual);
        }
	}
	
	public static void exercicio19(){
		//converte para fahrenheit e imprime
		for (int i = 10; i <= 100; i+=10) {
			System.out.println(i+" Celcius = "+((i*1.8)+32)+" Fahrenheit");
		}
	}
	
	public static void exercicio20(){
		long soma = 0;
		//le 15 valores
		for (int i = 1; i <= 15; i++) {
			long fat = 1;
			System.out.println("Informe o valor "+i);
			long valor = entrada.nextLong();
			//calcula o valor do fatorial
			for( int y = 2; y <= valor; y++ ) {   
			    fat *= y;  
			} 
			soma = soma + fat;
		}
		
		//soma os fatoriais
		System.out.println("O resultado é: "+soma);
	}
	
	public static void exercicio21(){
		int soma = 0;
		
		//le 10 valores
		for (int i = 1; i <= 10; i++) {
			System.out.println("Informe o valor "+i);
			int valor = entrada.nextInt();
			soma = soma + valor;
		}
		//calcula a média da soma dos valores
		System.out.println("total somatorio = "+soma);
		System.out.println("média = "+(soma/10));
	}

	public static void exercicio22(){
		int soma = 0;
		int cont = 0;
		int valor = 0;
		//le os valores enquanto forem positivos
		do{
			System.out.println("Informe um valor");
			valor = entrada.nextInt();
			if(valor > 0){
				soma = soma + valor;
				cont += 1;
			}
		} while (valor > 0);
		//calcula a média, some  apresenta a quantidade de valores lidos
		System.out.println("total somatorio = "+soma);
		System.out.println("média = "+(soma/cont));
		System.out.println("valores lidos = "+cont);
	}
	
	public static void exercicio23(){
		for (int i = 1; i <= 10; i++) {
			int fat = 1;
			if(i % 2 != 0){
				//calcula o valor do fatorial
				for( int y = 2; y <= i; y++ ) {   
				     fat *= y;  
				}
				System.out.println("O fatorial de "+i+" é "+fat);
			}
		}
	}
	
	public static void exercicio24(){
		int soma = 0;
		int cont = 0;
		//le os valores
		for (int i = 50; i <= 70; i++) {
			if(i % 2 == 0){
				soma = soma + i;
				cont += 1;
			}
		}
		//calcula a média da soma dos valores
		System.out.println("total somatorio = "+soma);
		System.out.println("média = "+(soma/cont));
	}
	
	public static void exercicio25(){
		int[] a = new int[15];
		int[] b = new int[15];
		//le a matriz A calcula o fatorial na matriz b
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			int fat = 1;
			for( int y = 2; y <= a[i]; y++ ) {   
			     fat *= y;  
			} 
			
			b[i] = fat;
		}
		//apresenta as duas matrizes
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A = "+a[i]+" , Matriz B = "+b[i]);
		}
		
	}
	
	public static void exercicio26(){
		int[] a = new int[4];
		int[] b = new int[4];
		int soma = 0;
		//le a matriz A calcula o fatorial na matriz b
		for (int i = 0; i < a.length; i++) {
			System.out.println("Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			soma = 0;
			for (int j = a[i]; j > 0; j--) {
				soma += j;
			}
			b[i] = soma;
		}
		//apresenta as duas matrizes
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz B = "+b[i]);
		}
		
	}
	
	
	
	public static void exercicio27(){
		int[] a = new int[15];
		int[] b = new int[15];
		int[] c = new int[30];
		//le a matriz A 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			c[i] = a[i];
		}
		//le a matriz B
		for (int i = 0; i < b.length; i++) {
			System.out.println("Matriz B - Informe o valor "+(i+1));
			b[i] = entrada.nextInt();
			c[i+15] = b[i];
		}
		//apresenta a matriz c
		for (int i = 0; i < c.length; i++) {
			System.out.println("C"+i+" = "+c[i]);
		}
		
	}
	
	public static void exercicio28(){
		int[] a = new int[20];
		int[] b = new int[30];
		int[] c = new int[50];
		//le a matriz A 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			c[i] = a[i];
		}
		//le a matriz B
		for (int i = 0; i < b.length; i++) {
			System.out.println("Matriz B - Informe o valor "+(i+1));
			b[i] = entrada.nextInt();
			c[i+20] = b[i];
		}
		//apresenta a matriz c
		for (int i = 0; i < c.length; i++) {
			System.out.println("C"+i+" = "+c[i]);
		}
		
	}
	
	public static void exercicio29(){
		int[] a = new int[20];
		int[] b = new int[20];
		//le a matriz A 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
		}
		//completa a matriz B
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - i -1];
		}
		//apresenta as matrizes
		for (int i = 0; i < a.length; i++) {
			System.out.println("A"+i+" = "+a[i]+" | B"+i+" = "+b[i]);
		}
		
	}
	
	public static void exercicio30(){
		int[] a = new int[20];
		int[] b = new int[20];
		//le a matriz A 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
		}
		//completa a matriz B
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i]/2;
		}
		//apresenta as matrizes
		for (int i = 0; i < a.length; i++) {
			System.out.println("A"+i+" = "+a[i]+" | B"+i+" = "+b[i]);
		}
	}
	
	public static void exercicio31(){
		int[] a = new int[30];
		int inpar = 0;
		int par = 0;
		//le a matriz 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			if(a[i] % 2 == 0){
				par++;
			} else {
				inpar++;
			}
		}
		//apresenta a quantidade de valores pares e inpares
		System.out.println("Existem "+par+" elementos pares no vetor");
		System.out.println("Existem "+inpar+" elementos inpares no vetor");
	}
	
	public static void exercicio32(){
		int[] a = new int[15];
		int par = 0;
		//le a matriz 
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			if(a[i] % 2 == 0){
				par++;
			} 
		}
		//apresenta a quantidade de valores pares
		System.out.println("Existem "+par+" elementos pares no vetor");
	}
	
	public static void exercicio33(){
		int[] a = new int[12];
		double[] b = new double[12];
		
		//le a matriz a e b
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			if(a[i] % 2 != 0){
				b[i] = a[i]*2;
			} 
		}
		//apresenta o vetor b
		for (int i = 0; i < b.length; i++) {
			System.out.println("Vetor B valor "+(i+1)+" = "+b[i]);
		}
	}
	
	public static void exercicio34(){
		int[] a = new int[12];
		double[] b = new double[12];
		
		//le a matriz a e b
		for (int i = 0; i < a.length; i++) {
			System.out.println("Matriz A - Informe o valor "+(i+1));
			a[i] = entrada.nextInt();
			if(a[i] % 2 == 0){
				b[i] = a[i]/2;
			} else {
				b[i] = a[i]*1.5;
			}
		}
		//apresenta o vetor b
		for (int i = 0; i < b.length; i++) {
			System.out.println("Vetor B valor "+(i+1)+" = "+b[i]);
		}
	}
	
	public static void exercicio35(float raio){
		//recebe o parametro , calculá e retorna o valume da esfera
		System.out.println("O volume da esfera é = "+((4.0/3.0)*Math.PI*Math.pow(raio,3)));
	}
	
	public static double exercicio36(double nota1,double nota2,double nota3){
		//recebe o parametro , calculá e retorna a média de notas
		return (nota1+nota2+nota3)/3;
	}
	
	public static String exercicio37(int a, int b, int c){
		//recebe o parametro , verifica e retorna o tipo de triângulo
		if(a == b && b == c){
			return "Triangulo Equilátero";
		} else if(a == b || b == c || a == c){
			return "Triangulo Isósceles";
		} else {
			return "Triangulo Escaleno";
		}
	}
	
	public static double[] exercicio38(double a,double b,double c){
		double[] raizes = new double[2];
		//calcula o delta
		double delta = b*b - 4*a*c;
		//calcula o x1 e x2
		double x1 = (-b + Math.sqrt(delta)) / (2*a);
		double x2 = (-b - Math.sqrt(delta)) / (2*a);
		//imprime o resultado
		if(delta >= 0){
			raizes[0] = x1;
			raizes[1] = x2;
			return raizes;
		} else {
			return null;
		}
	}
	
	public static String exercicio39(int tempoEmSegundos){
		//recebe o parametro em segundos , calculá e retorna em horas, minutos e segundos
		Integer horasEmSegundos = 3600;
		Integer horas = (tempoEmSegundos/horasEmSegundos);
	    Integer minutos = (tempoEmSegundos-(horasEmSegundos*horas))/60;
	    Integer segundos = (tempoEmSegundos-(horasEmSegundos*horas)-(minutos*60));
	    return horas.toString() + ":" + minutos.toString() + ":" + segundos.toString();
	}
	
	public static long exercicio40(long ano, long mes, long dias){
		//recebe o parametro em ano mes e dia , calculá e retorna em dias
		return (ano*365) + (mes*30) + dias;
	}

	public static void main(String[] args) {
		exercicio32();
	}

}
