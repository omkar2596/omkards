//video 28
//hash map
//map using hashmap-collection framewor
//
//
//duplicate value possible but cant repeat duplicate key ... key should be enique 

import java.util.HashMap;
import java.util.Map;
public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer,String> data = new HashMap<>();
       data.put(1,"o");
      data.put(2,"ooom");//2"n" bez line 19
       data.put(3,"a");
       data.put(4,"b");
       data.put(5,"n");
       System.out.println(data);
       
       data.remove(2);//remove key 2
       System.out.println(data);
       
       System.out.println(data.isEmpty());//boolean seperte karta yetey
       
       data.putIfAbsent(2, "lol");//putifabsent use kelamukey line 16 value print hotey ...hey hide karun check kra
       System.out.println(data);
	}

}
