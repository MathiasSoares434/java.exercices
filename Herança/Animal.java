package Herança;


public class Animal {
	public String cor;
	public double peso;
	public String nome;
	public String pelo;
	
	public Animal(String _cor,String _nome ,double _peso , String _pelo) {
		this.cor = _cor;
		this.nome = _nome;
		this.peso = _peso;
		this.pelo = _pelo;
	}
	public void comer() {
		System.out.println(nome + " esta comendo.");
	}
	public void som() {
		System.out.println(nome + " esta emitindo som");
	}
	public void latir() {
		System.out.println(nome + " esta latindo.");
	}
	public void miando() {
		System.out.println(nome + " esta miando.");
	}
}
