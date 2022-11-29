import java.util.TreeSet;
import java.util.Set;

//video 28
//TREE set
//set using treeset-collection framewor
//insorted manner
public class SetInterface_TreeSet {

	public static void main(String[] args) {
		
		Set<Integer> data = new TreeSet<>();
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
