package ch.hszt.mdp.pattern.strategy;

public class Tee implements Drinks {

	@Override
	public String prepare(Boolean sugar) {
		if(!sugar) {
			return "Tee ohne Zucker";
		}
		return "Tee mit Zucker";
	}

}
