package xyz.saurjk.animals;

public class Dog extends AnimalType {

	public Dog() {
		this.says();
		this.category();
		this.beingType();
		this.numberOfLegs();
	}

	private void says() {
		super.says("Bark");
	}

	private void category() {
		super.category("Scavenging Carnivore");
	}

	private void beingType() {
		super.beingType("Social");
	}

	private void numberOfLegs() {
		super.numberOfLegs(4);
	}

}
