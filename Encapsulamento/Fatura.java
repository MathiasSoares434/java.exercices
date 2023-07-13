package Encapsulamento;

public class Fatura {
	private String number;
	private String bio;
	private int amount;
	private double price;
	public Fatura(String _number,String _bio ,int _amount , double _price) {
		this.number = _number;
		this.bio = _bio;
		this.amount = _amount;
		this.price = _price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalFatura() {
		return amount * price;
	}
}
