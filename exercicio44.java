//dado o Array a seguir, {"a", "vida", "é", "bela"} faça um programa que crie um string com o texto retirado
//do Array e imprima no seguinte formato:
// A VIDA É BELA.


package Fundamentos;
public class exercicio44 {
public static void main(String[] args) {
	String arrayA[] = {"a", "vida", "e", "bela"};
	for (int i = 0; i < arrayA.length; i ++) {
		System.out.print(arrayA[i] + " ");
	}
}
}
