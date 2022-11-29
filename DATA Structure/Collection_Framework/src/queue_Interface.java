//video 28
//queue using LinkList-collection framework
import java.util.LinkedList;
import java.util.Queue;
public class queue_Interface {

	public static void main(String[] args) {
	  Queue<Integer> data = new LinkedList<>();
	  data.offer(10);//offer menns add 
	  data.offer(20);
	  data.offer(30);
	  System.out.println(data);
	  
	  System.out.println(data.peek());//peka==ak find out the front element
	  
	  data.poll();
	  System.out.println(data);//delete the data

	}

}
