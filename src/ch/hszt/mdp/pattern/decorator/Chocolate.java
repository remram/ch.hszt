package ch.hszt.mdp.pattern.decorator;

public class Chocolate extends Condiment {
	private double price;
	private String description;
	
	public Chocolate(Drinks decoratedDrk) {
		super(decoratedDrk);
		price = 1.3;
		description = "Schoko";
	}

	@Override
	public String getDescription() {
		return super.getDescription() + super.descSeparator + description;
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}

}
