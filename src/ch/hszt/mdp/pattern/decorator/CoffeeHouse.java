package ch.hszt.mdp.pattern.decorator;

public class CoffeeHouse {
	public static void main(String[] args) {
		Drinks drk1 = new Espresso();
		System.out.println(drk1.getDescription() + " = " 
				+ drk1.getPrice() + " SFr.");
		
		Drinks drk2 = new Cappuccino();
		System.out.println(drk2.getDescription() + " = " 
				+ drk2.getPrice() + " SFr.");
		drk2 = new Chocolate(drk2);
		System.out.println(drk2.getDescription() + " = " 
				+ drk2.getPrice() + " SFr.");
	}
}
