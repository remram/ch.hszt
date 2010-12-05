package ch.hszt.mdp.pattern.decorator;

public class Cappuccino implements Drinks {
	private double price;
	private String description;

	public Cappuccino() {
		price       = 6.10;
		description = "Cappuccino";
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
}
