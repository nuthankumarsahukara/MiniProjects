import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int x=sc.nextInt();
		System.out.println("Enter the Ending range");
		int y=sc.nextInt();
		int even=0;
		int odd=0;
		for(int i=x;i<=y;i++) {
			if(i%2==0) {
				even=even+i;
			}
			else {
				odd=odd+i;
			}
		}
		System.out.println("The Sum of Even is "+even);
		System.out.println("The Sum of Odd is "+odd);

	}

}
