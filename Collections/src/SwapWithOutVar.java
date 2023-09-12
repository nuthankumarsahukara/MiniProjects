import java.util.Scanner;

public class SwapWithOutVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the 2'nos to Swap");
		int a=ab.nextInt();
		int b=ab.nextInt();
		int temp;
		System.out.println("Before swapping number: "+a+","+b);
		a=b+a;
		b=a-b;
		a=a-b;
		System.out.println("After swapping number: "+a+","+b);

	}

}
