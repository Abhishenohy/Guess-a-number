package Guess;
import java.util.Scanner;
import java.util.Random;
public class GuessAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateRandom();

	}
	public static void generateRandom() {
		Random rand=new Random();
		int randomNum=rand.nextInt(11);
		guess(randomNum);
	}
	public static void guess(int randomNum) {
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		System.out.println("Number Guessing game");
		System.out.println("Guess a number between 0-10: ");
		int guess=sc.nextInt();
		System.out.println("");
		while(guess<0||guess>10) {
			System.out.print("Guess a number between 0-10: ");
			guess=sc.nextInt();
			System.out.println("");
		}
		int tries=0;
		while(guess!=randomNum) {
			tries++;
			System.out.println("Wrong Guess!");
			System.out.println("Guess Again: ");
			guess=sc.nextInt();
			System.out.println("");
		
			while(guess<0||guess>10) {
				System.out.print("Guess a number between 0-10: ");
				guess=sc.nextInt();
				System.out.println("");
			}
		}
		System.out.println("Correct Answer. You won!");
		System.out.println("Wrong Tries: "+tries);
		System.out.println("Press 1 to play again");
		System.out.println("Press 0 to exit");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:generateRandom();
			case 2:exit();
		}
		
		
	}
	private static void exit() {
		// TODO Auto-generated method stub
		
	}

}
