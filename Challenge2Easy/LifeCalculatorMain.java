/*
 * 9/28/2017
 * Create a simple calculator that can be applicable to life.
 * This calculator will determine the number of days it will take to reach 10,000 hours of coding practice.
 * Takes user input on how many hours per day, how many times a week, and then return the number of days from the starting point. 
 */
import java.util.Scanner;
public class LifeCalculatorMain {
	
	public static double hours;
	public static int weeklyFrequency;
	public static double totalDays;
	
	public static void askQuestions(){
		Scanner sc = new Scanner(System.in);
		
		//asks frequency of working and stores answers in variables.
		System.out.println("How many hours do you practice on the days you practice? \nEnter whole number or decimal");
		hours = Double.parseDouble(sc.nextLine());
		
		System.out.println("How many days per week do you practice?");
		weeklyFrequency = sc.nextInt();
	}//askQuestions
	
	public static void calculateDays(){
		double avgDailyHours = (hours*weeklyFrequency)/7;
		totalDays = 10000/avgDailyHours;
		System.out.println(totalDays);
	}//calculateDays
	
	public static void main(String args[]){
		askQuestions();
		calculateDays();
		System.out.println("It will take you " + totalDays + " days to reach 10,000 hours");
	}//main
	

}
