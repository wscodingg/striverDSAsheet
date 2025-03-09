import java.util.Scanner;

public class countDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to count digits init: ");
		int num = sc.nextInt();

		System.out.println("");
		String length = Integer.toString(num);

		System.out.println("The number " + num + " has " + length.length() + " digits.");

	}
}

