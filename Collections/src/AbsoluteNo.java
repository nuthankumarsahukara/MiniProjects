import java.util.Scanner;

public class AbsoluteNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the Number");
		int x=ab.nextInt();
		System.out.println("Given Number: "+x);
		if(x<0) {
			x=x*(-1);
		}
		System.out.println("Absolute Number: "+x);
	}

}
