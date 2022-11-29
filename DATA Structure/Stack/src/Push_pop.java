//video 19
//STACK USING ARREY IMPLEMENT
import java.util.Scanner;

class stack
 {
	    int top = -1;//-1 bez -1+1=index 0 hoto....first position la add hoto
		int n = 3;
		int [] a = new int[n];
		void push()
		{
			if(top == (n-1))//overflow condition
			{
				System.out.println("overflow");
			}
			else
			{
				System.out.println("enter data");
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
				top = top + 1;
				a[top] = i;
				System.out.println("itom inserted");
			}
		 }
		 void pop()
		 {
			 if(top == -1)
			 {
				 System.out.println("underflow");
			 }
			 else
			 {
				 top = top -1;
				 System.out.println("itom deleted");
			 }
		 }
		 void display()
		 {
			 System.out.println("display itoms are");
			 for(int j=top; j>=0;j--)  //loop top sey clu kela ahe 40 30 20 10
			 {
				 System.out.println(a[j]);
			 }
		 }
}
 
public class Push_pop {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		stack s = new stack();
		int d;
		int l;
	do
	{
		System.out.println("press 1 to push");
		System.out.println("press 2 to pop");
		System.out.println("press 3 to display");
		System.out.println("...................");
		System.out.println("enter your choice");
		d = sc.nextInt();
		
		switch(d)
		{
		case 1:
		{
			s.push();
			break;
		}
		case 2:
		{
			s.pop();
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



