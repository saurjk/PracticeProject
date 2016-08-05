package xyz.saurjk.prac;

import xyz.saurjk.animals.Cat;
import xyz.saurjk.animals.Chicken;
import xyz.saurjk.animals.Dog;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal.MyBuilder(new Cat(), "Sniffles").motionType("Walks").color("White").build();
		System.out.println(cat);

		Animal dog = new Animal.MyBuilder(new Dog(), "Roger").mostlyEats("Meat").motionType("Runs/Walks").color("Brown").build();
		System.out.println(dog);
		
		Animal dog1 = new Animal.MyBuilder(new Dog(), "Dave").motionType("Runs/Walks").color("Black").build();
		System.out.println(dog1);
		
		Animal chicken = new Animal.MyBuilder(new Chicken(), "Peck").color("Brown and White").mostlyEats("Grains and Seeds").build();
		System.out.println(chicken);
		
		Animal chicken1 = new Animal.MyBuilder(new Chicken(), "Buck").build();
		System.out.println(chicken1);
	}
}
