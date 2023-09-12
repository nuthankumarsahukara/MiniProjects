import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Factiorial No:");
		int x=sc.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial "+x+" is "+fact);
	}

}
