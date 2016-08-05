package xyz.saurjk.animals;

public abstract class AnimalType {

	private String says = "";
	private String category = "";
	private String beingType = "";
	private int numberOfLegs = 0;

	void says(String says) {
		this.says = says;
	}

	void category(String category) {
		this.category = category;
	}

	void beingType(String beingType) {
		this.beingType = beingType;
	}

	void numberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "AnimalType [says=" + says + ", category=" + category + ", beingType=" + beingType + ", numberOfLegs="
				+ numberOfLegs + "]";
	}

}
