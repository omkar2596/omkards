import java.util.Scanner;

import Linklist_Deleation.Node;



public class LinkedList_Operation {

		
		static class Node              //declear node sati creat class
		{                             //node data content karega 'data'&'address'
			int data;                  //data 
			Node next;                 //addres next node ka
			Node(int data)   
			{                           //creat constructor-is a function same as class name,by difault value ko stored karney key liye constructor use
	           this.data=data;
			   this.next=null;          //by diffult value stired krnasti and null asnar next
			}
		}
		Node head= null;                 //line-4to 14 link list creat 

		
		public void creation() 
	{
		  int data;
		  int n;
		  int m;
		  int p;
		  Scanner sc = new Scanner(System.in);
		  
		  do
		  {  
		  System.out.print(" enter data:");
		  //System.out.println("LinkedList Create Successful");
		  data = sc.nextInt();                
		  Node new_node = new Node(data);//line 6 la data transfer
		  if(head == null)                  //link list not exist node condition //means node nahi ahe
		  {
			 head = new_node;             //assign new node address to head
		  }
		  else                            //link list exist node condition //means node ahe
		  {
			  System.out.println(" ");
			  System.out.println("LinkedList Create Successful");
			  System.out.println("**************MENU**************");
			  System.out.println("enter 1:insert the node in beginning");
				System.out.println("enter 2:insert the node at the last");
				System.out.println("enter 3:insert the node at particular position");
				System.out.println("enter 4:delete the node at particular position");
				System.out.println("enter 5:Length of the link list");
				System.out.println("enter 6:reverse the link list");
				System.out.println("enter 7:display the link list");
			  m= sc.nextInt();
			  
			  switch(m)
			  {
			  case 1:
				  new_node.next=head;       
				  head=new_node;
				  break;
				  
			  case 2:
				  Node temp = head;
				  while(temp.next != null)
				  {
					  temp = temp.next;
				  }
				  temp.next = new_node;//new node ka address add hon
				  break;
				  
			  case 3:
				  System.out.println("enter position");
				  p= sc.nextInt();
				  Node temp1 = head;
				  for(int i=0; i<(p-1);i++)
				  {
					  temp1 = temp1.next;
				  }
				  new_node.next=temp1.next;
				  temp1.next= new_node;
				  break;
			  case 4:
					
					
						 int data1;
						  int nn;
						  int mm;
						  int pp;
						  System.out.println("enter position node to be deleted");
						  p= sc.nextInt();
						  Node temp2 = head;
						  Node ptr1=temp2.next;
						  for(int i=0; i<(p-2);i++)
						  {
							  temp2 = ptr1;
							  ptr1 = ptr1.next;
						  }
						  
						  temp2.next= ptr1.next;
						  break;    
						
									
				  case 7:
				  System.out.println("display");
				  System.out.println(data);
			  }
			         
		  }
		  System.out.print("doo you want to continue press enter '1' ");
//		  System.out.println("enter any key to exit");
		  n = sc.nextInt();
		  }
		  while(n == 1);
	 }
		public void traverser() 
		{
			Node temp = head;//first node ko point out krey
			if(head == null)
			{
				System.out.println("LL does not exist");
			}
			else
			{
				while(temp != null)
				{
					System.out.println(temp.data+ " ");// temp mdla data print honar
					temp = temp.next;
				}
					
			}
		}
	
		

	public static void main(String[] args) 
	{
        //System.out.println("link");
		LinkedList_Operation LL = new LinkedList_Operation();
		LL.creation();
		LL.traverser();
		

	}

}
