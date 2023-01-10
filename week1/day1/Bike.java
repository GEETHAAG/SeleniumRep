package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Bike:Applied break");

	}
	public void soundHorn() {
		System.out.println("Bike:Sound horn");

	}
	public static void main(String[] args) {
		Bike obj = new Bike();
		Car obj1=new Car();
		obj.applyBreak();
		obj.soundHorn();
		obj1.applyBreak();
		obj1.soundHorn();
		
		
		
		
	}

}
