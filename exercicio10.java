package Fundamentos;
import java.util.Scanner;
public class exercicio10 {
public static void main(String[] args) {
	Scanner ask = new Scanner(System.in);
	System.out.println("Digite um numero ");
	double resp = ask.nextDouble();
	System.out.println(resp < 0 ? "NEGATIVO" : resp == 0 ? "NEUTRO" "POSITIVO");
}
}
