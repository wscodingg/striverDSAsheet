import java.util.Scanner;

public class rightangledTrianglePattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int num = sc.nextInt();
		System.out.println("");

		for(int i=0; i<num; i++){
			for(int j=0; j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
