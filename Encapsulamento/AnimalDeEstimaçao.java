package Encapsulamento;

public class AnimalDeEstimaçao {
	private String name;
	private String animal;
	private int age;
	
	public AnimalDeEstimaçao(String _name, String _animal, int _age) {
		this.name= _name;
		this.animal=_animal;
		this.age = _age;		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
