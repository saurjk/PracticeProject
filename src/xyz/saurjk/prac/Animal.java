package xyz.saurjk.prac;

import xyz.saurjk.animals.AnimalType;

public class Animal {

	private final AnimalType animalType;
	private final String animalName;
	private final String motionType;
	private final String mostlyEats;
	private final String color;

	public String getMotionType() {
		return motionType;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public String getAnimalName() {
		return animalName;
	}

	public String getMostlyEats() {
		return mostlyEats;
	}
	
	public String getColor() {
		return color;
	}

	public static class MyBuilder {
		private final AnimalType animalType;
		private final String animalName;
		private String motionType;
		private String mostlyEats;
		private String color;

		public MyBuilder(AnimalType animalType, String animalName) {
			this.animalType = animalType;
			this.animalName = animalName;
		}

		public MyBuilder motionType(String motionType) {
			this.motionType = motionType;
			return this;
		}

		public MyBuilder mostlyEats(String mostlyEats) {
			this.mostlyEats = mostlyEats;
			return this;
		}
		
		public MyBuilder color(String color){
			this.color = color;
			return this;
		}

		public Animal build() {
			return new Animal(this);
		}
	}

	private Animal(MyBuilder builder) {
		this.animalType = builder.animalType;
		this.animalName = builder.animalName;
		this.motionType = builder.motionType;
		this.mostlyEats = builder.mostlyEats;
		this.color = builder.color;
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", animalName=" + animalName + ", motionType=" + motionType
				+ ", mostlyEats=" + mostlyEats + "]";
	}

}
