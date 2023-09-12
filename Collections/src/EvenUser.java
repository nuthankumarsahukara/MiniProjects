import java.util.Scanner;

public class EvenUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int x=sc.nextInt();
		System.out.println("Enter the Ending range");
		int y=sc.nextInt();
		for(int i=x;i<=y;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
