//video 28
//stack using push ,pop, peak -collection framework

import java.util.List;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> data = new Stack<Integer>();
		data.push(100);//push- insert data
		data.push(200);
		System.out.println(data);
		
		int d = data.peek();//peak-acces top element
		System.out.println(d);
		
		data.pop();
		System.out.println(data);//pop-delete top data
		
		int dd = data.search(100);//value search karun index no sagnar
		System.out.println(dd);

	}

}
