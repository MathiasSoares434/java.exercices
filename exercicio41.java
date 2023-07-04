package Fundamentos;

public class exercicio41 {
public static void main(String[] args) {
 String str = "   1 texto que nao tem relevancia    ";
 System.out.print(str.trim().replaceAll("\\s+", " "));
}
}
