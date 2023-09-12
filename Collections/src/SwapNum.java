import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the 2'nos to Swap");
		int a=ab.nextInt();
		int b=ab.nextInt();
		int temp;
		System.out.println("Before swapping number: "+a+","+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping number: "+a+","+b);

	}

}
