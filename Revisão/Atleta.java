package Revisão;

public class Atleta {
	public String name;
	public int age;
	public boolean aquecer= false;
	
	public Atleta(String _name, int _age) {
		this.name = _name;
		this.age = _age;	
	}
	public void aquecer() {
		if(this.aquecer == true) {
			System.out.println(this.name + " está aquecido");
		}
		else{
			System.out.println(this.name + " ainda não aqueceu");
		}
	}
	public void descansar() {
		if(this.aquecer == true) {
			System.out.println(this.name + " começe a descansar");
		}
		else {
			System.out.println(this.name + " já esta a descansar");
		}
	}
}
