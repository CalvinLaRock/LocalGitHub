package programoptimization.string;

import java.util.StringTokenizer;

/**
 * Title: ExampleForsplitAndStringToKenizerAndindexOf.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-18 下午4:06:18 <br>
 * 
 * @author CuiHua
 */
public class ExampleForsplitAndStringToKenizerAndindexOf {

	String orgStr = null;

	public static void main(String[] arg) {
		ExampleForsplitAndStringToKenizerAndindexOf e = new ExampleForsplitAndStringToKenizerAndindexOf();
		e.splitMethod();
		e.stringTokenizerMethod();
		e.customMethod();
	}

	public ExampleForsplitAndStringToKenizerAndindexOf() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 1000; i++) {
			sb.append("i").append(";");
		}
		orgStr = sb.toString();
	}

	public void splitMethod() {
		System.out.println("-----------------split--------------");
		long startDate = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			orgStr.split(";");
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}

	public void stringTokenizerMethod() {
		StringTokenizer st = new StringTokenizer(orgStr, ";");
		System.out.println("-----------------StringTokenizer--------------");
		long startDate = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			while (st.hasMoreTokens()) {
				st.nextToken();
			}
			st = new StringTokenizer(orgStr, ";");
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}

	public void customMethod() {
		String tmp = orgStr;
		System.out.println("-----------------custom--------------");
		long startDate = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			while (true) {
				String splitStr = null;
				int j = tmp.indexOf(";");
				if (j < 0)
					break;
				splitStr = tmp.substring(0, 1);
				tmp = tmp.substring(j + 1);
			}
			tmp = orgStr;
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}
}
