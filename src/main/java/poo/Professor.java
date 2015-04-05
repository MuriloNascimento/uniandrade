package poo;

import java.util.Scanner;

public class Professor {

	private int id;
	private String nome;
	private String sexo;
	private int matricula;
	public static Scanner entrada = new Scanner(System.in);
	
	public void atualizacaoSalario(){}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public Professor() {
		// TODO Auto-generated constructor stub
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void calculaMedia(Aluno aluno){
		
		Double[] notas = new Double[4];
		
		for (int i = 0; i < notas.length ; i++) {
			
			System.out.println("Informe a nota "+(i+1));
			notas[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		if((soma/4)>=7.0){
			System.out.println("O aluno "+aluno.getNome()+" esta aprovado");
		} else {
			System.out.println("O aluno "+aluno.getNome()+" esta reprovado");
		}
		
	}


}
