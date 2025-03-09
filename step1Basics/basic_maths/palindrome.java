import java.util.Scanner;

public class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check whether it's palindrome or not: ");
		int num = sc.nextInt();
		int original_number = num;

		int reverse = 0;
		int remainder;

		while(num>0){
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}

		if(reverse == original_number){
			System.out.println("Your number " + original_number + " is palindrome.");
		}
		else{
			System.out.println("Your number: "+ original_number + " is not palindrome.");
		}
	}
}

			
