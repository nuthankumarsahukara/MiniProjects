import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three Number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println(x+" is the biggest");
		}
		else if(y>x && y>z) {
			System.out.println(y+" is the biggest");
		}
		else {
			System.out.println(z+" is the biggest");
		}
	}

}