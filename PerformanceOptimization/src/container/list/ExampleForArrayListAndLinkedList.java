package container.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleForArrayListAndLinkedList {
	
	public static void main(String[] arg){
		ExampleForArrayListAndLinkedList e=new ExampleForArrayListAndLinkedList();
		e.listMethod();
		e.linkedlistMethod();
	}
	
	/*
	 * list就是对数据进行操作,默认大小为10
	 * 新增时,每次判断容量大小,不够时进行扩容1.5倍到2倍,扩容会导致数组内存复制
	 * 任意位置插入时,需要把插入位后的所有数据重新排列,性能较低.但插入尾部的性能较高
	 * 任意位置删除时,需要把插入位后的所有数据重新排列,性能较低.但删除尾部的性能较高
	 */
	private void listMethod(){
		Object obj=new Object();
		List list=new ArrayList();
		System.out.println("-----------------list--------------");
		long startDate = System.currentTimeMillis();
		for(int i=1;i<500000;i++){
			list.add(obj);
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}
	
	/*
	 * linkedlist是链式结构,每次删除或新增都比较灵活.
	 * 在删除时,把数据分为2部分,判断在前半部分还是在后半部分,增加速度.但删除中间的效率非常慢,需要遍例一半的数据才行.
	 */
	private void linkedlistMethod(){
		Object obj=new Object();
		List list = new LinkedList();
		System.out.println("-----------------linkedlist--------------");
		long startDate = System.currentTimeMillis();
		for(int i=1;i<500000;i++){
			list.add(obj);
		}
		long endDate = System.currentTimeMillis();
		System.out.println("Execution time:" + (endDate - startDate));
		System.out.println("------------------------------------");
	}
	
}
