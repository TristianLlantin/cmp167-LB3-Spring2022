import java.util.Scanner;
import java.util.Random;
public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Welcome to Lucky Lottery");
		System.out.println("Enter the number to play with: ");
		int userNumber = input.nextInt();
		System.out.println("How much is your wager: ");
		double wager = input.nextDouble();
		System.out.println();
		System.out.println("Lucky Lottery Has Started...");
		
		double userEarnings = 0.0;
		for(int i = 0; i < 3; i++) { 
			int number = rand.nextInt(10)+1;
			System.out.println(" # " +number);
			if(number == userNumber) {
				System.out.println("You're a lucky winner!");
				
				if(i==0) {
					userEarnings = userEarnings+(wager*100);
				}
				else if(i==1) {
					userEarnings = userEarnings+(wager*50);
				}
				else {
					userEarnings = userEarnings+(wager*10);
				}
			}
			else { 
				System.out.println("You are a lucky loser");
			}
		}
				System.out.println("Earnings $"+ userEarnings);
	}
}

