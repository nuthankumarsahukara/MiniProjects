import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample {
	public static void main(String[] args) {
		SortedSet s= new TreeSet();
		s.add(15);
		s.add(96);
		s.add(85);
		s.add(25);
		s.add(8);
		
		System.out.println(s);
		
		Iterator n=s.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
		}
	}
}
