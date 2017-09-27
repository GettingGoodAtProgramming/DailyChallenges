/*9/27/2017

gets name, age, and username from user input
Stores in a text file
*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class NameCollectorMain{
	
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String name, username;
		int age;
		String fileName = "StoreNames.txt";
		
		System.out.println("Enter you name");
		name = sc.nextLine();
		
		System.out.println("Enter your age");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter your username");
		username = sc.nextLine();

		System.out.println("Your name is " + name + ", You are " + age + " years old,  Your username is " + username + ".");
		
		String storage = ('\n' + name + " " + Integer.toString(age)+ " " + username);
		
		try
		{
		    FileWriter fw = new FileWriter(fileName,true); //the true will append the new data
		    fw.write(storage);//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		
		sc.close();
	}//main
	
	
}
