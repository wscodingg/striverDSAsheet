import java.util.Scanner;
import java.util.*;

public class factorization{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to factorize: ");
		int num = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=num; i++){
			if(num%i == 0){
				list.add(i);
			}
		}

		System.out.println(list);
	}
}

