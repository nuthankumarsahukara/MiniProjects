import java.util.Scanner;

public class MultTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which table do you want : ");
		int x=sc.nextInt();
		for(int i=x;i<=x;i++) {
			for(int j=1;j<=12;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}

	}

}
