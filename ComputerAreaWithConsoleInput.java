package chengcuqingdan;

import java.util.Scanner;

public class ComputerAreaWithConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creat a scanner  object
		Scanner  input = new Scanner(System.in);
		//Prompt the user to enter the radius
		System.out.print("Enter a number for radius:");
		double radius =input.nextDouble();
		//Computer area
		double area = radius*radius*3.14159;
		//Display  results
		System.out.println("The area for the circle of radius"+radius+"is"+area);
		
	}

}
