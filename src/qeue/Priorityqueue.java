package qeue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> name=new PriorityQueue<String>();
		
		name.add("raj kumar");
		name.add("hevin jack");
		name.add("saravana");
		name.add("martin sundar");
		System.out.println("head:"+name.element());
		System.out.println("head:"+name.peek());
		
		Iterator itr=name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		name.poll();
		name.remove();
		
		System.out.println("after removing two elements");
		
		Iterator itr1=name.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
