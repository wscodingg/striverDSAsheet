import java.util.Scanner;
	
public class increasingNumberTrianglePattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = 1;
		System.out.println("Enter number of rows: ");
		int num = sc.nextInt();

		for(int i=1; i<num; i++){
			for(int j=1; j<i; j++){
				System.out.print(number);
				number = number + 1;
			}
			System.out.println("");
		}
	}
}
