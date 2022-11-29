// stack using arrey with scaneer class
//video 28
import java.util.Scanner;
import java.util.*;
public class stack_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> data = new Stack<>();
		for(int i=0; i<3; i++)
		{
			System.out.println("enter no");
			int value = sc.nextInt();
			data.push(value);
		}
		System.out.println(data);
		
		data.push(1000);
		System.out.println(data);
		
		data.pop();
		System.out.println(data);

	}

}
