package thread.ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccessMapThread {

	public static void main(String[] arg) {
		Map map = new ConcurrentHashMap();
		map.put("abc", 123);
		map.get("123");
	}

}
