package ch.hszt.mdp.pattern.strategy;

public class Cola implements Drinks {

	@Override
	public String prepare(Boolean sugar) {
		if(!sugar) {
			return "Cappuccino Zero";
		}
		return "Cappuccino normal";
	}

}
