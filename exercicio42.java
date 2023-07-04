package Fundamentos;
import java.util.Scanner;
public class exercicio42 {
public static void main(String[] args) {
	int i = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um texto: ");
	while(scanner.hasNext()) {
	i++;
	System.out.println("Texto: " + scanner.next());
	}

	scanner.close();
}
}
