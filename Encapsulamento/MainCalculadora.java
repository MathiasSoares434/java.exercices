package Encapsulamento;

public class MainCalculadora {
public static void main(String[] args) {
	Calculadora calculadora = new Calculadora();
	int resultadoInteiro = calculadora.soma(2, 5);
	float resultadoFloat = calculadora.soma(2.5f, 5.5f);
	
	System.out.println(resultadoInteiro);
	System.out.println(resultadoFloat);
}
}
