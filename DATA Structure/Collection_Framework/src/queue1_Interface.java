//video 28
//queue using priority queue-collection framework
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class queue1_Interface {

	public static void main(String[] args) {
		Queue<Integer> data = new PriorityQueue<>();
		//Queue<Integer> data = new PriorityQueue<>(Comparator.reverseOrder()); USE THIS TO AHE TSE LINE NEY PRINT HOTEY OP 100 20 30
		data.offer(100);
		data.offer(20);
		data.offer(30);
		
		System.out.println(data);//20 30 100 bez priority queue   bez implement the heap 
		
		data.poll();
		System.out.println(data); //first element delete 
	}

}
