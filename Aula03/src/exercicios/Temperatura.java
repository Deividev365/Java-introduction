package exercicios;

public class Temperatura {
	
	public Boolean calor;
	public String celsius = "26 C";
	public String temporada = "summer";
	
	
	
	public void fazerFrio() {
		if(calor == true) {
			calor = false;
		}
	}
}
