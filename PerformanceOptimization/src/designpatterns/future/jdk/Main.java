package designpatterns.future.jdk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Title: Main.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-19 下午4:27:48 <br>
 * 
 * @author CuiHua
 */
public class Main {

	public static void main(String[] arg) throws InterruptedException, ExecutionException {
		FutureTask future = new FutureTask(new RealData("a"));
		ExecutorService executor = Executors.newFixedThreadPool(1);
		// 开启线程进行RealData的call()执行
		executor.submit(future);
		System.out.println("请求完毕");
		
		try {
			//执行其他的业务操作
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("数据 = " + future.get());
	}
}
