
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the 2 no's");
			int x=scan.nextInt();
			int y=scan.nextInt();
			System.out.println(x+" + "+y+" = "+(x+y));
		}
		catch(InputMismatchException e){
			System.out.println("Please enter Integer no's");
		}
		finally {
			System.out.println("Thank you for our Programming");
		}
		
	}

}
