package day9Functionn;

public class UseCar {
	public static void main(String[]args) {
		Car c1=new Car();
		c1.brand="Honda";
		c1.price=250000;
		c1.color="RED";
		
		Car c2=new Car();
		c2.brand="Hyundai";
		c2.price=280000;
		c2.color="BLACK";
		
		Car[] c= {c1,c2};
		System.out.println(c1.findMinPriceCar(c1,c2));
		System.out.println(c1.findMaxPriceCar(c1, c2));
		
		
	}

}

class Car {
	String brand;
	String color;
	int price;
	String sample;

	public String findMinPriceCar(Car c1, Car c2) {
		if (c1.price < c2.price) {
			return c1.brand;
		} 
		else {
			return c2.brand;
		}
	}

	public String findMaxPriceCar(Car c1, Car c2) {
		if (c1.brand.length() > c2.brand.length()) {
			return c1.brand;
		} else {
			return c2.brand;
		}
	}

}
