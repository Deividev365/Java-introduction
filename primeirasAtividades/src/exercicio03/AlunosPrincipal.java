package exercicio03;

public class AlunosPrincipal {

	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos();
		Alunos aluno2 = new Alunos();
		
		
		aluno1.setNome("Deivid");
		aluno1.setNumeroMatricula(355548);
		aluno1.setNota1(2);
		aluno1.setNota2(5);
		aluno1.setTrabalho1(2);
		
		aluno1.calcularMedia();
		aluno1.imprimirSituacaoAluno();
		
		
		
		aluno2.setNome("Beatriz");
		aluno2.setNumeroMatricula(448448);
		aluno2.setNota1(10);
		aluno2.setNota2(9);
		aluno2.setTrabalho1(6);
		
		aluno2.calcularMedia();
		aluno2.imprimirSituacaoAluno();
	

	}

}
