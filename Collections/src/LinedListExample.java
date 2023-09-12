import java.util.LinkedList;
import java.util.List;

public class LinedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lst=new LinkedList();
		lst.add(45);
		lst.add(50);
		lst.add(63);
		lst.add(96);
		lst.add(56);
		lst.add(89);
		int sum=0;
		
		for(int i=0;i<lst.size();i++) {
			String x=lst.get(i).toString();
			sum=sum+Integer.parseInt(x);
		
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+(sum/6.0));

	}

}
