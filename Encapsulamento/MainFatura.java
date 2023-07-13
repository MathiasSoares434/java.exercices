package Encapsulamento;

public class MainFatura {
public static void main(String[] args) {
	Fatura one = new Fatura("01", "Monitor", 3, 314.15);
	System.out.println(one.getNumber() + " " + one.getBio());
	System.out.println("A fatura total é: " + one.getTotalFatura());
	
	Fatura two = new Fatura("02", "Gabinete", 2, 249.25);
	System.out.println(two.getNumber() + " " + two.getBio());
	System.out.println("A fatura total é: " + two.getTotalFatura());
}
}
