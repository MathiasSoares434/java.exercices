package Encapsulamento;

public class MainAnimalDeEstimaçao {
public static void main(String[] args) {
	AnimalDeEstimaçao one = new AnimalDeEstimaçao("Apolo", "Cachorro", 10);
	System.out.println(one.getName() + " é um " + one.getAnimal() + " e tem " + one.getAge() + " anos.");
	one.setName("Rex");
	one.setAnimal("Gato");
	System.out.println(one.getName() + " é um " + one.getAnimal() + " e tem " + one.getAge() + " anos.");


}
}
