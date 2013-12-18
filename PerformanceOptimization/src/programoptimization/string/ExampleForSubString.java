package programoptimization.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: ExampleForSubString.java<br>
 * Description:
 * string类的subString方法，可使内存泄漏。subString方法内使用String的构造方法，使用字符位移，数量大导致。<br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-18 下午2:27:14 <br>
 * 
 * @author CuiHua
 */
public class ExampleForSubString {

	public static void main(String[] arg) {
		List<String> handler = new ArrayList<String>();
		for (int i = 0; i < 10000; i++) {
			// HugeStr h = new HugeStr();
			ImprovedHugeStr h = new ImprovedHugeStr();
			handler.add(h.getSubString(1, 5));
		}
	}

	/*
	 * 导致内在泄漏。得到截取的子字符串，但同时得到源字符串的内存空间
	 */
	static class HugeStr {
		private String str = new String(new char[10000]);

		public String getSubString(int begin, int end) {
			return str.substring(begin, end);
		}
	}

	/*
	 * 每次生成一个新的内存空间，该空间的大小是新的长度
	 */
	static class ImprovedHugeStr {
		private String str = new String(new char[10000]);

		public String getSubString(int begin, int end) {
			return new String(str.substring(begin, end));
		}
	}
}
