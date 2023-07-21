package Revisão;

public class Humano {
	private String name;
	private int age;
	private double height;
	
	public Humano(String _name, int _age, double _height) {
		this.name = _name;
		this.age = _age;
		this.height = _height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void comer(String comida) {
		System.out.println(name + " está comendo " + comida);
	}
	
	public void dormir(int horas) {
		System.out.println(name + " está dormindo por " + horas + " horas");
	}
}
