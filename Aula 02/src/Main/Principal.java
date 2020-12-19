package Main;

public class Principal {

	public static void main(String[] args) {
		
		// instanciando uma classe no java // 
		Cachorro cao = new Cachorro("Rex");
		
		
		//cao.name = "Meg";//
		cao.age = 7;
		cao.height = 45;
		
		
		System.out.println(cao.name);
		
		cao.latir();
		
	}

}
