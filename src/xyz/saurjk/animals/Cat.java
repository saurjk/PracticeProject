package xyz.saurjk.animals;

public class Cat extends AnimalType {

	public Cat() {
		this.says();
		this.category();
		this.beingType();
		this.numberOfLegs();
	}

	private void says() {
		super.says("Purr");
	}

	private void category() {
		super.category("Obligate or Strictly Carnivore");
	}

	private void beingType() {
		super.beingType("Mostly Solitary");
	}

	private void numberOfLegs() {
		super.numberOfLegs(4);
	}

}
