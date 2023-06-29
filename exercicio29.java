package Fundamentos;
import java.util.Scanner;
public class exercicio29 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     System.out.print("Digite o tamanho do array: ");
     int tamanho = scanner.nextInt();

     // Criação do array com o tamanho informado
     int[] array = new int[tamanho];

     System.out.println("Digite os elementos do array:");

     // Loop para receber os elementos do usuário
     for (int i = 0; i < tamanho; i++) {
         System.out.print("Elemento " + (i + 1) + ": ");
         array[i] = scanner.nextInt();
     }

     System.out.println("Os elementos do array são:");

     // Loop para exibir os elementos do array
     for (int i = 0; i < tamanho; i++) {
         System.out.println("Elemento " + (i + 1) + ": " + array[i]);
     }

     scanner.close();
}
}
