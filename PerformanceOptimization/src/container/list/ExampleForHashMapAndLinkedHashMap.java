package container.list;

import java.util.HashMap;
import java.util.Map;

public class ExampleForHashMapAndLinkedHashMap {

	public static void main(String[] arg) {
		ExampleForHashMapAndLinkedHashMap e=new ExampleForHashMapAndLinkedHashMap();
		e.hashMapMethod();
	}

	/*
	 * 初始大小16,负载因子0.75  负载因子=元素个数/内部数组总大小
	 * hashmap的key是由object类的hashcode和hashmap的内部函数hash方法生成
	 * 当hash发生冲突时(hash和key都相等),将老的entry中的值赋于新值,老的值返回
	 */
	private void hashMapMethod(){
		Map<Object,Object> map=new HashMap<Object,Object>();
		Object obj=new Object();
		System.out.println("-----------------hashMap--------------");
		long startDate = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			GoodHash b=new GoodHash(i);
//			BadHash b=new BadHash(i);
			map.put(b, obj);
			map.get(b);
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}
	
}

class BadHash {
	double d;

	public BadHash(double d) {
		this.d = d;
	}

	@Override
	public int hashCode() {
		return 1;
	}
}

class GoodHash {
	double d;
	public GoodHash(double d) {
		this.d = d;
	}

}