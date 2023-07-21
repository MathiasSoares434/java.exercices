package Felicidade;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	public void andar() {
		System.out.println(name +" esta andando.");
	}
	public void comer() {
		System.out.println(name + " esta comendo.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
