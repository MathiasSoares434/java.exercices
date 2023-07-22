package javaExercicesHome;
import java.util.Scanner;
public class VogalResult {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um nome: ");
	String name = scanner.nextLine();
	
	Vogal vowel = new Vogal();
	System.out.println(vowel.letter(name));
	
	for(char c : name.toCharArray()) {
		String letra = Character.toString(c);
		if(vowel.letter(letra)) {
			System.out.println(letra);
		}
	}
}
}
