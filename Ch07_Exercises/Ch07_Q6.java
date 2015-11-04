/*
 * Chapter 7 Question 6
 * 
 * Population of Mexico at end of 2014: 123.8 million
 * Growth Rate: 0.5% per year
 * 
 */

import java.util.Scanner;

public class Ch07_Q6 {

	public static void main(String[] args) {
		
		final int STARTING_YEAR = 2014;
		final double STARTING_POPULATION = 123.8;
		final double GROWTH_RATE = 0.05;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a target population in millions:");
		
		double currentPopulation = STARTING_POPULATION;
		int currentYear = STARTING_YEAR;
		
		double targetPopulation = s.nextDouble();
		
		//targetPopulation = 200;
		
		
		while (currentPopulation < targetPopulation) {
			
			currentYear++;
			currentPopulation *= 1+GROWTH_RATE;
			
		}
		
		System.out.println("The population of Mexico will exceed "+targetPopulation+" by the year " + currentYear);
		
		
	}

}
