import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ListExample {

	public static void main(String[] args) {
		List lst=new ArrayList();
		lst.add(18);
		lst.add(15);
		lst.add("Welcome");
		lst.add(19.36);
		lst.add(15);
		lst.add("Welcome");
		
		System.out.println(lst);
		System.out.println(lst.get(2));
		System.out.println("");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		System.out.println("");
        Iterator x=lst.iterator();
        while(x.hasNext()) {
        	System.out.println(x.next());
        }
        System.out.println("");
        for(Object a:lst) {
        	System.out.println(a);
        }
	}

}
