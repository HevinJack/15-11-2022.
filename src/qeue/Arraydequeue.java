package qeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Arraydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> a=new ArrayDeque<String>();
		
		a.add("Gautam");
		a.add("dhoni");
		a.add("yuvraj");
		a.add("shewag");
		
		for (String str:a) {
			System.out.println(str);
		}
		
	}

}
