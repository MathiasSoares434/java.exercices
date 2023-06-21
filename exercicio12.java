package Fundamentos;
import java.util.Scanner;
public class exercicio12 {
public static void main(String[] args) {
	Scanner ask = new Scanner(System.in);
	System.out.println("Digite primeiro numero ");
	int numberOne = ask.nextInt();
	System.out.println("Digite segundo numero ");
	int numberTwo = ask.nextInt();
	System.out.println("Digite terceiro numero ");
	int numberThree = ask.nextInt();
	
	System.out.println(numberOne > numberTwo && numberTwo > numberThree ? "O maior é" + numberOne + "e o menor é" + numberThree : numberTwo > numberOne && numberOne > numberThree ? "O maior é " + numberTwo + "e o menor é" + numberThree : numberThree > numberOne && numberOne > numberTwo ? "O maior é " + numberThree + "e o menor é" + numberTwo : "O maior é " + numberThree + "e o menor é" + numberOne);
	



}
}
