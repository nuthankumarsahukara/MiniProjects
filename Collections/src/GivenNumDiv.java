import java.util.Scanner;

public class GivenNumDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the 2 No's");
		int a=x.nextInt();
		int b=x.nextInt();
		if(a%b==0) {
			System.out.println(a+" is Divisible By "+b);
		}
		else {
			System.out.println(a+" is Not Divisible By "+b);
		}
	}

}
