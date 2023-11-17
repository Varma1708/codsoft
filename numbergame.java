package Numbergame;

import java.util.Scanner;


public class numbergame {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	     int answer = 42; // Set the answer to 42

	        int attempts = 0;
	        boolean hasGuessedCorrectly = false;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it.");
	        
	        while (!hasGuessedCorrectly) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;
	            
	            if (userGuess < answer) {
	                System.out.println("Try a higher number.");
	            } else if (userGuess > answer) {
	                System.out.println("Try a lower number.");
	            } else {
	                hasGuessedCorrectly = true;
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	            }
	        }
	        
	        scanner.close();
	    }
	}