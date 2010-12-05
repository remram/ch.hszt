package ch.hszt.mdp.pattern.decorator;

public abstract class Condiment implements Drinks {

	protected Drinks decoratedDrk;
	protected String descSeparator;

	public Condiment(Drinks decoratedDrk) {
		this.decoratedDrk = decoratedDrk;
		descSeparator = ", ";
	}

	public double getPrice() {
		return decoratedDrk.getPrice();
	}

	public String getDescription() {
		return decoratedDrk.getDescription();
	}
}
