import java.util.Scanner;

public class armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find it's armstrong: ");
		int num = sc.nextInt();

		String str = Integer.toString(num);
		int power = str.length();
		int sum = 0;

		for(int i=0 ;i<power ; i++){
			sum = sum + (int) Math.pow((Integer.parseInt(String.valueOf(str.charAt(i)))), power);
		}

		if(sum == num){
			System.out.println("The number " + num + " is an armstrong number.");
		}
		else{
			System.out.println("The number " + num + " is not an armstrong number.");
		}
		
	}
}


