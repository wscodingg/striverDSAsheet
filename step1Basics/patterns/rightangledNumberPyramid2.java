import java.util.Scanner;

public class rightangledNumberPyramid2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int num = sc.nextInt();

		System.out.println("");

		for(int i=1; i<=num; i++){
			for(int j=0; j<=i; j++){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}

