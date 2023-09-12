import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set st=new HashSet();
		st.add(15);
		st.add(36);
		st.add(96);
		st.add(15);
		st.add(96);
		
		System.out.println(st);
		
		Iterator x=st.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}

	}

}
