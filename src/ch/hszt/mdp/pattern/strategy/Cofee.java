package ch.hszt.mdp.pattern.strategy;

public class Cofee implements Drinks {

	@Override
	public String prepare(Boolean sugar) {
		if(!sugar) {
			return "Kaffee ohne Zucker";
		}
		return "Kaffee mit Zucker";
	}

}
