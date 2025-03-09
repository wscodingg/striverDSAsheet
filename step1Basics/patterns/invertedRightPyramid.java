import java.util.Scanner;

public class invertedRightPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int num = sc.nextInt();

		System.out.println("");

		for(int i=1; i<=num; i++){
			for(int j=i; j<=num; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


