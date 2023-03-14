package Package1;

import java.util.Scanner;

public class Circle {
	
	public static void area (float radius) {
	
		double area_of_circle = (radius*radius)*Math.PI;
		
		System.out.println("Area of Circle is = "+ area_of_circle);
	 
	 
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter floar value here");
		
		float radius = sc.nextFloat();
		
		area(radius);
		
		
		
		
		
		
		

	}

}
