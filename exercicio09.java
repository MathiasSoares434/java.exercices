package Fundamentos;
import java.util.Scanner;
public class exercicio09 {
public static void main(String[] args) {
	Scanner ask = new Scanner(System.in);
	System.out.println("Digite um numero ");
	double resp = ask.nextDouble();
	if(resp < 0) {
		System.out.println("NEGATIVO");
	}
	else {
		System.out.println("POSITIVO");
	}
}
}
