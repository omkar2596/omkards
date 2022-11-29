//video 26
//queue USING LL IMPLEMENT
import java.util.Scanner;

class queue1
 {
	
	   static class Node1
	   {
		   int data;
		   Node1 next;
		   Node1(int data)
		   {
			   this.data=data;
			   this.next=null;
		   }
	   }
	   Node1 f=null;
	   Node1 r=null;
	   
		
		void enqueue(Scanner sc)
		{
			System.out.println("enter data");
			int data = sc.nextInt();
			Node1 new_Node1 = new Node1(data);
			if( f == null)
			{
				f = new_Node1;
				r = new_Node1;
				
			}
			else
			{
				r.next= new_Node1;
				r = new_Node1;
				
			}
		}
		 void dequeue()
		 {
			if(f==null)
			{
				System.out.println("underflow");
			}
			else
			{
				f=f.next;
			}
		 }
		 void display()
		 {
			 Node1 temp = f;
			 while(temp != null)
			 {
				 System.out.println(temp.data);
				 temp=temp.next; 
			 }
		 }
}
 
public class LL_Queue {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		queue1 s = new queue1();
		int d;
		int l;
	do
	{
		System.out.println("press 1 to enqueue");
		System.out.println("press 2 dequeue");
		System.out.println("press 3 to display");
		System.out.println("...................");
		System.out.println("enter your choice");
		d = sc.nextInt();
		
		switch(d)
		{
		case 1:
		{
			s.enqueue(sc);
			break;
		}
		case 2:
		{
			s.dequeue();
			break;
		}
		case 3:
		{
			s.display();
			break;
		}
		}
		System.out.println("enter '0'zero to back main menu");
		System.out.println("enter any key to exit");
		
		l = sc.nextInt();
	}
	while(l == 0);
	System.out.println("exit succesful");
		
	}
}



