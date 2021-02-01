package exercicios;

public class CarroPrincipal {

	public static void main(String[] args) {
		// criando o objeto do constructor da classe // 
		
		
		// set = atribuir valor
		// get = obter valor de um atributo para  exibir em tela
		
		Carro van = new Carro();
		
		van.setMarca("Porsche");
		van.setModelo("911 targa 4s");
		van.setPreco(998.000);
		
		System.out.println("O nome do carro é : " + van.getMarca() + " e o modelo e: " + van.getModelo() + "o valor e: " + van.getPreco());
	}

}
