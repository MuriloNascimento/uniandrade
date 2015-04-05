package poo;

public class Main {
	
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Fulano");
		
		Professor professor = new Professor();
		professor.calculaMedia(aluno);

	}

}
