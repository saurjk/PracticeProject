package xyz.saurjk.animals;

public class Chicken extends AnimalType {

	public Chicken() {
		this.says();
		this.category();
		this.beingType();
		this.numberOfLegs();
	}

	private void says() {
		super.says("Bawk Bawk Bawk");
	}

	private void category() {
		super.category("Herbivore");
	}

	private void beingType() {
		super.beingType("Domesticated, Lives together in flocks");
	}

	private void numberOfLegs() {
		super.numberOfLegs(2);
	}
}
