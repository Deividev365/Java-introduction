package exercicios;

public class TelevisoesPrincipal {

	public static void main(String[] args) {
		Televisoes televisaoSala = new Televisoes();
		
		
		System.out.println(
			"Est� Televisao � da marca " + televisaoSala.fabricante + 
			"  E a televis�o est�: " + (televisaoSala.ligado == true ? "ligada" : "desligada") + " o volume � " + televisaoSala.volume
				
				
				);
		televisaoSala.ligar();
		televisaoSala.aumentarVolume();
		
		
		
		
		System.out.println(
				"Est� Televisao � da marca " + televisaoSala.fabricante + 
				"  E a televis�o est�: " + (televisaoSala.ligado == true ? "ligada" : "desligada") + " o volume � " + televisaoSala.volume
					);
		
		

	}

}
