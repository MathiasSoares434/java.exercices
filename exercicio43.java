package Fundamentos;

public class exercicio43 {
public static void main(String[] args) {
	String tex01 = "Será que são iguais?";
	String tex02 = "Será que são iguais?";	
	boolean b2 = tex01.equals(tex02);
	boolean b3 = tex01.equalsIgnoreCase(tex02);
	System.out.println(b2);
	System.out.println(b3);
}
}
