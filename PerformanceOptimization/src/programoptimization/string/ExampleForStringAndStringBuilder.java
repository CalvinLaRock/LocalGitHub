package programoptimization.string;

/**
 * Title: ExampleForStringAndStringBuilder.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-18 下午5:05:55 <br>
 * 
 * @author CuiHua
 */
public class ExampleForStringAndStringBuilder {

	public static void main(String[] arg) {
		ExampleForStringAndStringBuilder e = new ExampleForStringAndStringBuilder();
		e.stringMethod();
		e.stringbuilderMethod();
	}

	/*
	 * String进行相加操作时，会增加新的内存空间，但是在编译时，会提前把字符串拼接。
	 * 所以，对静态字符串的连接操作，在编译时会进行优化，使得在代码运行减少时间。
	 */
	public void stringMethod() {
		System.out.println("-----------------string--------------");
		long startDate = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			String result = "string" + "and" + "String" + "test";
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}

	/*
	 * stringbuilder的初始大小是16字节(b)，当累加的长度大于默认大小时，会进行扩容操作，扩容为原来的2倍<br>
	 * 所以在使用大数据累加时，应该提前设定容量大小，否则会增加性能消耗时间。
	 */
	public void stringbuilderMethod() {
		System.out.println("-----------------stringBuilder--------------");
		long startDate = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("string").append("and").append("String").append("test");
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}
}
