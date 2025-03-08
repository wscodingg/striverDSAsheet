import java.util.Scanner;

public class traingularnumber{
	public static int sum(int count, int num, int sum){
		if(count > num){
			return sum;
		}

		sum = sum + count;
		return sum(count+1, num, sum);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to find sum: ");
		int num = sc.nextInt();
		int sum = 0;

		sum(sum, num, sum);
		System.out.println("The sum of 1 to " + num + " is: " + sum);
	}
}

