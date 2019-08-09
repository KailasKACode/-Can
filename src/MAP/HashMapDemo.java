package MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap lp = new LinkedHashMap();
		lp.put(1, "Test");
		lp.put(2, "kiran");
		lp.put("2", 3);
		lp.put(3, "jivan");
		System.out.println(lp);
		Set entrySet = lp.entrySet();
		Iterator it = entrySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
