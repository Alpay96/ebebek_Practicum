package ebebek_practicum_java101_tasks;

import java.util.Scanner;

public class GreengrocerCashBoxProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5.0;
		double kg, sum = 0;
		System.out.print("How many kilograms of pear: ");
		kg = scan.nextDouble();
		sum += kg * pear;
		System.out.print("How many kilograms of apple: ");
		kg = scan.nextDouble();
		sum += kg * apple;
		System.out.print("How many kilograms of tomato: ");
		kg = scan.nextDouble();
		sum += kg * tomato;
		System.out.print("How many kilograms of banana: ");
		kg = scan.nextDouble();
		sum += kg * banana;
		System.out.print("How many kilograms of aubergine: ");
		kg = scan.nextDouble();
		sum += kg * aubergine;
		System.out.println("Total Price: " + sum + " TL");
	}
}
