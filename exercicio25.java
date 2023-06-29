package Fundamentos;

public class exercicio25 {
public static void main(String[] args) {
	int numberThree= 3;
	int numberFive= 5;
	int somaThree= 0;
	int somaFive= 0;
	
	for(int i = 1; i<=20; i++) {
		if( i %numberThree == 0) {
			somaThree= i;	
			System.out.println("A soma dos multiplos de 3 abaixo de 20 e:" + somaThree);			
		}
		
	}
	for(int i = 1; i<=20; i++) {
		if(i % numberFive == 0) {
			somaFive= i;			
			System.out.println("A soma dos multiplos de 5 abaixo de 20 e:" + somaFive);
		}
		
	}
	int res = somaThree + somaFive;
	System.out.println("A soma dos multiplos de 3 e 5 abaixo de 20 e:" + res);
}
}
