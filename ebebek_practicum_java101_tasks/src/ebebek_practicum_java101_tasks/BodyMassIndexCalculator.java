package ebebek_practicum_java101_tasks;

import java.util.Scanner;

public class BodyMassIndexCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your height in metric format (like -> '1,82') : ");
        double height = scan.nextDouble();

        System.out.print("Please enter your weight in kg format: ");
        double weight = scan.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Your body mass index is: " + bodyMassIndex);
	}
}
