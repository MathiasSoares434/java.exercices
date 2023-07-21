package Revisão;

public class MainAtleta {
public static void main(String[] args) {
	Ciclista ciclista01 = new Ciclista("Mathias", 25);
	Corredor corredor01 = new Corredor("Hernane", 54);
	Nadador nadador01 = new Nadador("Leonardo", 27);
	
	ciclista01.aquecer = true;
	corredor01.aquecer = true;
	nadador01.aquecer = true;
	
	ciclista01.pedalar();
	corredor01.correr();
	nadador01.nadar();
}
}
