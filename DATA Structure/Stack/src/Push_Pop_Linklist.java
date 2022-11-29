//video 20
//stack using LL

import java.util.Scanner;

class stack1
{
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data= data;
			this.next= null;
		}
	}
		Node top= null;
	
	public void push(Scanner sc)//sc referance to main methode
	{
		System.out.println("enter data");
		int data = sc.nextInt();
		Node new_node = new Node(data);
		if(top == null)
		{
			top = new_node;
		}
		else
		{
			new_node.next=top;
			top= new_node;
		}
	}
	public void pop()
	{
		if(top == null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			top = top.next;
		}
	}
	public void display()
	{
		Node temp = top; //use pointer throgh travesl data
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
  }



public class Push_Pop_Linklist {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		stack1 s = new stack1();
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
			s.push(sc);
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

