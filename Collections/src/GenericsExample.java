import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer> lst=new LinkedList<Integer>();
		lst.add(52);
		lst.add(61);
		lst.add(63);
		
		System.out.println(lst);
		
		Iterator x=lst.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}		
	}
}
