import java.util.Scanner;

public class invertedNumberedRightPyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int num = sc.nextInt();

		System.out.println("");

		for(int i=0; i<num; i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
