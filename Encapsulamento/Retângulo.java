package Encapsulamento;

public class Retângulo {
	private double base;
	private double altura;
	
	public Retângulo(double _base, double _altura) {
		this.base = _base;
		this.altura= _altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base= base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	
	public double getTotalArea() {
		return (base * altura)/2;
	}
}
