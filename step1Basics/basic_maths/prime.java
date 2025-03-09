import java.util.Scanner;
import java.util.*;

public class prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check whether it's prime or not: ");
		int num = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();

		for(int i=1; i<=num; i++){
			if(num%i == 0){
				list.add(i);
			}
		}

		if(list.size() == 2){
			System.out.println(num + " is a prime number because it has " + list.size() + " divisors: " + list);
		}
		else{
			System.out.println(num + " is not a prime number because it has " + list.size() + " divisors: " + list);
		}
	}
}
