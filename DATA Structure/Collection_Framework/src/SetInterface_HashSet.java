//video 28
//hash set
//set using hashset-collection framewor
//unsorted manner

import java.util.HashSet;
import java.util.Set;
public class SetInterface_HashSet {

	public static void main(String[] args) 
	{
		Set<Integer> data = new HashSet<>();
		data.add(10);
		data.add(20);
		data.add(100);
		data.add(60);
		System.out.println(data);//20 100 10 60 BEZ UNORDER SET OF ATOM and arrey list la inorder ahe main diff hash set and arreylist
		
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
