package Fundamentos;

public class exercicio34 {
public static void main(String[] args) {
	String one = "Hello";
	String two = "HELLO";
	boolean b1 = one.equals("Hello");
	boolean b2 = one.equals(two);
	boolean b3 = one.equalsIgnoreCase(two);
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
}
}
