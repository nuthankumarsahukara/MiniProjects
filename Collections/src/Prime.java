import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int x=sc.nextInt();
		System.out.println("Enter the Ending range");
		int y=sc.nextInt();
		int count=0;
		for(int i=x;i<=y;i++) {
			for(int j=2;j<=x;j++) {
				if(i%j==0) {			
					count=0;
					break;
			}
				else {
					count=1;
				}		
		}
			if(count==1){
				System.out.println(i);
			}
		
	}
	}
}
