package exercicio03;

public class Alunos {

	private int numeroMatricula;
	private String nome;
	private double nota1 = 0;
	private double nota2 = 0;
	private double trabalho1 = 0;
	
	
	private double mediaAlunoMatriculado = 0;
	private String mensagem = "";
	
	
	
	public double calcularMedia() {
		double mediaAluno1 = (nota1 + nota2 + trabalho1) / 3;
		
		return this.mediaAlunoMatriculado = mediaAluno1;
		
	}
	
	
	
	public String IsAproved(String mensagem) {
		
		if(mediaAlunoMatriculado >= 6) {
			
			mensagem = "Aprovado!!";
			this.mensagem = mensagem;
			return this.mensagem;
			
		} else if(mediaAlunoMatriculado < 6 && mediaAlunoMatriculado >=4) {
			
			mensagem = "Deve realizar o IFA";
			this.mensagem = mensagem;
			return this.mensagem;
	
		} else if(mediaAlunoMatriculado < 4) {
			
			mensagem = "Infelizmente reprovado";
			this.mensagem = mensagem;
			
			return this.mensagem;
		}
		return mensagem;	
	}



	public int getNumeroMatricula() {
		return numeroMatricula;
	}



	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}



	public double getNota2() {
		return nota2;
	}



	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}



	public double getTrabalho1() {
		return trabalho1;
	}



	public void setTrabalho1(double trabalho1) {
		this.trabalho1 = trabalho1;
	}



	public double getMediaAlunoMatriculado() {
		return mediaAlunoMatriculado;
	}



	public void setMediaAlunoMatriculado(double mediaAlunoMatriculado) {
		this.mediaAlunoMatriculado = mediaAlunoMatriculado;
	}



	public String getMensagem() {
		return mensagem;
	}



	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	public void imprimirSituacaoAluno() {
		System.out.println("O ALUNO - " + getNome() + " da Matrícula " + getNumeroMatricula() + " teve a média de " + getMediaAlunoMatriculado() + " e foi: " + IsAproved(mensagem));
	}
	
	
}
