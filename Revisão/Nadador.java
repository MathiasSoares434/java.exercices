package Revisão;

public class Nadador extends Atleta  {
		public Nadador(String _name, int _age) {
			super(_name, _age);
		}
		boolean aquecido = false;
		
		public void nadar() {
			if(aquecido == true) {
				System.out.println("Nadador esta nadando");
			}else {
				System.out.println("Nadador esta parado");
			}
		}
		public void pararNadar() {
			if(aquecido == false) {
				System.out.println("Nadador parou de nadar");
			}else {
				System.out.println("Nadador ainda esta nadando");

			}
		}
	

}
