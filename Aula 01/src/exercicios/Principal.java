package exercicios;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa younger = new Pessoa("Beatriz");
			
			younger.age = 1;
			younger.eyeColor = "Blue";
			younger.gender = "Female";
			
			
			System.out.println("Meu nome é " + younger.name + " e eu tenho " + younger.age + " anos");
			
			younger.andar();
			younger.falar();
			
			
			
			
	}
	
}
