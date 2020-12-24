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
			
			
			Pessoa older = new Pessoa("Jose");
			
			older.age = 60;
			older.eyeColor = "Green";
			older.gender = "Male";
			
			
			System.out.println("Meu nome é " + older.name + " e eu tenho" + older.age + " anos");
			
			older.andar();
			older.falar();
			
			
			
			
			
			
			
	}
	
}
