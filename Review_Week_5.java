import java.util.Random;
public class Review_Week_5 {

	public static void main(String[] args) {
		Random r = new Random();
		int a, b, c;
		a=10;
		b=18;
		c=12;
		
		if (a>b) {
			System.out.println("A is greater");
		}
		else if (b<c) {
			System.out.println("C is greater than b");
		}
		else {
			System.out.println("A is not greater than b & b is not less than c");
		}
		int the_number = r.nextInt(5)+1;
		switch(the_number) {
		case 1:{
			System.out.println("The value is 1");
			break;
		}
		case 2:{
			System.out.println("The value is 2");
			break;
		}
		case 3:{
			System.out.println("The value is 3");
			break;
		}
		default:
			System.out.println("default: The value is "+the_number);
		}

	}

}
