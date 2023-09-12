import java.util.Scanner;

public class PtvNeg {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=x.nextInt();
		if(a>0) {
			System.out.println(a+" is Postive Number");
		}
		else {
			System.out.println(a+" is Negative Number");
		}
	}

}
