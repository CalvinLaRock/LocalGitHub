package designpatterns.future;

/**
 * Title: RealData.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-19 下午3:30:07 <br>
 * 
 * @author CuiHua
 */
public class RealData implements Data {

	protected final String result;

	public RealData(String para) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 10; i++) {
			sb.append(para);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		result = sb.toString();
	}

	@Override
	public String getResult() {
		return result;
	}

}
