package Herança;
import java.util.Date;
public class main {
public static void main(String[] args) {
	Aluno i = new Aluno("José Franscisco", "123.456.789-00", new Date());
	System.out.println("Veja comos os atributos foram preenchidos \n\nNome:" + i.nome);
}
}
