package ch.hszt.mdp.pattern.strategy;

public class TasteIt {
	public static void main(String[] args) {
		OrderDrinks od;
		
		od = new OrderDrinks(new Cofee());
		od.orderIt(true);
		od.orderIt(false);
		
		od = new OrderDrinks(new Cola());
		od.orderIt(true);
		od.orderIt(false);
		
		od = new OrderDrinks(new Tee());
		od.orderIt(true);
		od.orderIt(false);
	}
}
