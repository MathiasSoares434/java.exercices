package Revisão;

public class MainHumano {


public static void main(String[] args) {
	Humano one= new Humano("Mathias", 25, 1.87);
	System.out.println(one.getName() + " " + one.getAge() + " anos e " + one.getHeight() + " de altura.");
	one.comer("Esfirra");
	one.dormir(12);
}
}
