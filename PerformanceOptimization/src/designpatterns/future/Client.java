package designpatterns.future;

/**
 * Title: Client.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-19 下午3:23:23 <br>
 * 
 * @author CuiHua
 */
public class Client {
	public Data request(final String queryStr) {
		final FutureData future = new FutureData();
		new Thread() {
			public void run() {
				RealData realData = new RealData(queryStr);
				future.setRealData(realData);
			}
		}.start();
		return future;
	}
}
