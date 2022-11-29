//video 24
//queue USING ARREY IMPLEMENT
import java.util.Scanner;

class queue
 {
	    int f = -1;//-1 bez -1+1=index 0 hoto....first position la add hoto
		int r = -1;
	    int n = 10;
		
		int [] q = new int[n];
		void enqueue()
		{
			if(r ==(n-1))
			{
				System.out.println("overflow condition");
			}
			else
			{
				System.out.println("enter data");
				Scanner sc = new Scanner(System.in);
				int i= sc.nextInt();
				if(f == -1 && r == -1)
				{
					f = 0;
					r = 0;
					q[r] =i;
				}
				else
				{
					r= r +1;
					q[r]=i;
				}
			}
		 
		}
		 void dequeue()
		 {
			 if(f == -1 && r == -100)
			 {
				 System.out.println("underflow");
			 }
			 else
			 {
				 f = f + 1;
			 }
		 }
		 void display()
		 {
			 System.out.println("display itoms are");
			 for(int i=f;i<=r;i++)
			 {
				 System.out.println(q[i]);
			 }
			
		 }
}
 
public class Queue_Arrey {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		queue s = new queue();
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
			s.enqueue();
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



