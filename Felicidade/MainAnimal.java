package Felicidade;

public class MainAnimal {
public static void main(String[] args) {
	Cachorro cachorro = new Cachorro("Bolt");
	Gato gato = new Gato("Garfield");
	Peixe peixe = new Peixe("Nemo");
	Aranha aranha = new Aranha("Aranha");
	cachorro.andar();
    cachorro.comer();
    System.out.println("Nome do cachorro: " + cachorro.getName());

    gato.andar();
    gato.comer();
    System.out.println("Nome do gato: " + gato.getName());

    peixe.comer();
    System.out.println("Nome do peixe: " + peixe.getName());

    aranha.andar();
    aranha.comer();
    System.out.println("Nome da aranha: " + aranha.getName());
}
}
