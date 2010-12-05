package ch.hszt.mdp.pattern.decorator;

public class Espresso implements Drinks {
	private double price;
	private String description;
	
	public Espresso() {
		price       = 5.90;
		description = "Espresso";
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
}
