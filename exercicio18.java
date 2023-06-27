package Fundamentos;

import java.util.Scanner;

public class exercicio18 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	System.out.print("Digite um número entre 0 e 20: ");
	int numbers= scanner.nextInt();
	while(numbers!= 0) {
		if (numbers%2 == 0) {
			System.out.println("Os numeros par e: " + numbers);
		
		}else {
			System.out.println("Os numeros impare e: " + numbers);
		
		}
        System.out.print("Digite outro número (ou 0 para sair): ");
        numbers = scanner.nextInt();
	}
	System.out.println("Programa encerrado.");
	scanner.close();
}
}
