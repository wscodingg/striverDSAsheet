import java.util.Scanner;

public class reverseanumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to reverse: ");
		int num = sc.nextInt();

		int reverse = 0;
		int rem;

		while(num > 0){
			rem = num % 10;
			reverse = (reverse * 10) + rem;
			num = num / 10;
		}

		System.out.println("Reversed number: " + reverse);
	}
}

