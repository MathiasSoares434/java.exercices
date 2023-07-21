package Revisão;

public class Ciclista extends Atleta {
	public Ciclista(String _name, int _age) {
		super(_name, _age);
	}
	boolean aquecido = false;
	
	public void pedalar() {
		if(aquecido == true) {
			System.out.println("Ciclista esta pedalando");
		}else {
			System.out.println("Ciclista esta parado");
		}
	}
	public void pararPedalar() {
		if(aquecido == false) {
			System.out.println("Ciclista parou de pedalar");
		}else {
			System.out.println("Ciclista ainda esta pedalando");

		}
	}
}
