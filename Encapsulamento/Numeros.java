package Encapsulamento;

public class Numeros {
	private int peso;
	private String nome;
	
	int x = 100;

	public Numeros(String _nome ,int _peso ) {
		this.nome = _nome;
		this.peso = _peso;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = x;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}
