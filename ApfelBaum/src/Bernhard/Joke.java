package Bernhard;

import java.util.Scanner;

public class Joke {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Findest du Bananen lecker?");
		String userInput;
		userInput = sc.next();
		
		if ("ja".equals(userInput)) {
			System.out.println("hi");
		}
		
		else {System.out.println("Na gut musst du wissen.");
		
		}
	}
	
	
	
	
}
