package Encapsulamento;

public class MainRetangulo {
public static void main(String[] args) {
	Retângulo one = new Retângulo(21.5, 56.3);
	System.out.println(one.getBase() + "cm de base, " + one.getAltura()  + "cm de altura e " + one.getTotalArea() + "cm de área total.");
	one.setAltura(50);
	one.setBase(30.5);
	System.out.println(one.getBase() + "cm de base, " + one.getAltura()  + "cm de altura e " + one.getTotalArea() + "cm de área total.");

}
}
