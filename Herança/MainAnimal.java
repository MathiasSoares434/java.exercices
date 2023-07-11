package Herança;

public class MainAnimal{
public static void main(String[] args) {
	Cachorro apolo = new Cachorro("Preto e Branco", "Apolo", 20.5, "Liso");
	System.out.println("Veja comos os atributos foram preenchidos do cachorro:" + apolo.cor + ", " + apolo.nome + ", " + apolo.peso+ ", " + apolo.pelo);
	apolo.comer();
	apolo.latir();
	
	Gato x = new Gato("Amarelo", "Ze da Manga", 10.0, "Rasta");
	System.out.println("Veja comos os atributos foram preenchidos do gato:" + x.cor + ", " + x.nome + ", " + x.peso+ ", " + x.pelo);
	x.comer();
	x.miando();

}
}
