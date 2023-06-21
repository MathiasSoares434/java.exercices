package Fundamentos;
import java.util.Scanner;
public class exercicio11 {
public static void main(String[] args) {
	Scanner ask = new Scanner(System.in);
	System.out.println("Digite primeiro numero ");
	int numberOne = ask.nextInt();
	System.out.println("Digite segundo numero ");
	int numberTwo = ask.nextInt();
	System.out.println("Digite terceiro numero ");
	int numberThree = ask.nextInt();
	
	if(numberOne > numberTwo && numberTwo > numberThree) {
		System.out.println("O maior é " + numberOne + "e o menor é" + numberThree);
	}
	else if(numberTwo > numberOne && numberOne > numberThree) {
		System.out.println("O maior é " + numberTwo + "e o menor é" + numberThree);
	}
	else if(numberThree > numberOne && numberOne > numberTwo) {
		System.out.println("O maior é " + numberThree + "e o menor é" + numberTwo);
	}
	else {
		System.out.println("O maior é " + numberThree + "e o menor é" + numberOne);
	}

}
}
