package designpatterns.future;
/**
 * Title: Main.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013	<br>
 * Create DateTime: 2013-12-19 下午3:19:03 <br>
 * @author CuiHua
 */
public class Main {
	public static void main(String[] arg){
		Client client=new Client();
		//请求数据，但得到的是FutureData，不是RealData
		Data data=client.request("name");
		System.out.println("请求结束");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("数据 = "+data.getResult());
	}
}
