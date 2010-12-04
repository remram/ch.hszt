package ch.hszt.mdp.pattern.strategy;

public class OrderDrinks {
	private Drinks drk;
	
	public OrderDrinks(Drinks drk) {
		this.drk = drk;
	}
	
	public void orderIt(Boolean sugar) {
		System.out.println(this.drk.prepare(sugar));
	}
}
