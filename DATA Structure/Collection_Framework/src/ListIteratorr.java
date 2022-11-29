import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//list iterator -arrey list mdhun krnar
public class ListIteratorr  {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		data.add(50);
		data.add(20);
		
		ListIterator<Integer> data1 =data.listIterator();
		while(data1.hasNext())
		{
			System.out.println(data1.next());//50 20
		}
		while(data1.hasPrevious())
		{
			System.out.println(data1.previous());//50 20 20 50
		}


	}

}
