package oop.polymorphism;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		for(int i=1;i<=3;i++) {
			System.out.println(i+"시간 후");
			dog.run();
			dog.print();
			chicken.run();
			chicken.print();
			cheatableChicken.run();
			cheatableChicken.print();
		}
	}
}












