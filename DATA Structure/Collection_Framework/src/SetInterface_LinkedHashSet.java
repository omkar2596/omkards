////video 28
//hash set
//set using linkedhashset-collection framewor
//insorted manner

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class SetInterface_LinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> data = new LinkedHashSet<>();
		data.add(10);
		data.add(20);
		data.add(100);
		data.add(60);
		data.add(100);//cant use duplicate itom but list use
		System.out.println(data);//10 20 100 60 
		
	    	
		
		data.remove(100);
		System.out.println(data);
		
		int s=data.size();
		System.out.println(s);
		
		boolean c =data.contains(60);
		System.out.println(c);
		
		data.clear();
		System.out.println(data);
		
		
		
		

	}

}
