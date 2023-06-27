package Fundamentos;
public class exercicio23 {
public static void main(String[] args) {
       
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println(); // Quebra de linha após imprimir uma linha completa
    }
}
}
