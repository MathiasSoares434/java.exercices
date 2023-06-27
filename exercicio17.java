package Fundamentos;
import java.util.Scanner;

public class exercicio17 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int totalAlunos;
	double somaNotas=0;
	int contador= 0;	
	System.out.print("Quantos alunos tem na sala?");
	totalAlunos = scanner.nextInt();
	while(contador<totalAlunos) {
		System.out.print("Digite a nota do aluno" + (contador + 1)+ ":");
		double nota = scanner.nextDouble();
		somaNotas+=nota;
		contador ++;
	}
	double media = somaNotas/totalAlunos;
	System.out.println("A média da turma é: " + media);
	scanner.close();
}
}