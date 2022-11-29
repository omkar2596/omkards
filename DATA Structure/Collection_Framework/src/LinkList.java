//28 //same as arrey link list

import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) 
	{
		LinkedList<Integer> data = new LinkedList<>();//generic<> int type data
		data.add(10);//add some data 'add is direct add its a colection frame work'
		data.add(20);
		data.add(30);
		data.add(40);
		System.out.println(data);
	
		data.remove(1);//index 1 data remove honar
		System.out.println(data);
		
		int g=data.get(0);//index '0' data print honar
		System.out.println(g);
	
		
		data.set(0,2222);//set a particular index
		System.out.println(data);
		
		boolean b = data.contains(40);//contains check value ahe ka nahi tey list mdey
		System.out.println(b);
		
		
		data.clear();//delete krnasti all data
		System.out.println(data);
		 	

	}

}
