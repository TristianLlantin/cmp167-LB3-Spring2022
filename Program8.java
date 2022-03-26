/**
 * 
 * @author TristianLlantin
 *
 */
import java.util.Arrays;

public class Program8 {

	public static void main(String[] args) {
		String[] names = {"Andy", "Jovi", "Samy","Jeremy"};
		System.out.println(names[1]);
		names[0] = "Lebron James";
		int aLength = names.length;
		System.out.println(aLength);
		
		System.out.println(names[3]);
		System.out.println(names[names.length - 1]);
		int [] numbers = new int[100];
		numbers[0] = 54;
		double [] balances = new double[] {45.60, 36.85, 40.47};
		System.out.println(balances.length);
		for (int i=0; i < balances.length; i++) {
			balances[i] = balances[i]*100;
		}
		System.out.println(Arrays.toString(balances));
		double sum = 0.0;
		for(double balance: balances)
			sum+= balance;
		System.out.println("Total balance "+sum);
		System.out.print("[ ");;
		for (double balance: balances)
			System.out.print(balance +" ");;
			System.out.println("]");
	}
}

