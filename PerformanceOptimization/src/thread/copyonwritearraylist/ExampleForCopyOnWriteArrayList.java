package thread.copyonwritearraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExampleForCopyOnWriteArrayList {

	public static void main(String[] args) {
		List cal=new CopyOnWriteArrayList();
		cal.add(args);
		cal.get(0);
		cal.size();
	}

}
