/*********************************************************************************
* Triangle class that extends GeometricObject.                                   * 
*********************************************************************************/

import java.util.Scanner;
import java.util.Date;  

public class Main {
	public static void main(String[] args) {
    System.out.println("This program gets input for a triangle from the user.\n" +
    "It then creates a Triangle object and displays its description.");
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

    // Prompt the user to enter a color
		System.out.print("Enter the color of the triangle (e.g. red): ");
		String color = input.next();

    // Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (y or n): ");
		String filled = input.next();
    Boolean vFilled;
    if (filled == "y"){
      vFilled = true;
    }
    else{
      vFilled = false;
    }

		// Prompt the user to enter three sides of the triangle
		System.out.print("Enter the non-zero, positive lengths of the three sides of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// Create triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(vFilled);

		System.out.println(triangle.toString());
    System.out.println("Created on: " + triangle.getDateCreated());
		System.out.println("Color: " + triangle.getColor() + " and filled = " + triangle.isFilled());
    System.out.println("Area: " + triangle.getArea());
    System.out.println("Goodbye.");
	}
}