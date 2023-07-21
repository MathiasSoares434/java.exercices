package Revisão;

public class Corredor {
	public Corredor(String _name, int _age) {
		super();
	}

	boolean aquecido = false;
	public boolean aquecer;
	public void correr() {
		
		if(aquecido == true) {
			System.out.println("Corredor esta correndo");
		}else {
			System.out.println("Corredor esta parado");
		}
	}
	public void pararCorrer() {
		if(aquecido == false) {
			System.out.println("Corredor parou de correr");
		}else {
			System.out.println("Corredor ainda esta cndo");

		}
}
}