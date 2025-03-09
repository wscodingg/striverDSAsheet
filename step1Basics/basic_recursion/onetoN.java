import java.util.Scanner;

public class onetoN{
	
	public static void print(int count, int num){
		if(count > num){
			return;
		}

		System.out.println(count);

		print(count+1, num);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Print 1 to ");
		int num = sc.nextInt();

		print(1, num);
	}
}

