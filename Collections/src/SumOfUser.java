import java.util.Scanner;

public class SumOfUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending range of the sum: ");
		int x=sc.nextInt();
		int sum=0;
		for(int i=1;i<=x;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of "+x+" is "+sum);
	}

}
