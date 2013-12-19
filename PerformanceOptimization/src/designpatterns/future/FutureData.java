package designpatterns.future;

/**
 * Title: FutureData.java<br>
 * Description: <br>
 * Copyright (c) 第7天 2013 <br>
 * Create DateTime: 2013-12-19 下午3:26:03 <br>
 * 
 * @author CuiHua
 */
public class FutureData implements Data {

	protected RealData realdata = null;

	protected boolean isRead = false;

	public synchronized void setRealData(RealData realdata){
		if(isRead){
			return ;
		}
		this.realdata=realdata;
		isRead=true;
		notifyAll();
	}
	
	@Override
	public synchronized String getResult() {
		while(!isRead){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		return realdata.result;
	}

}
