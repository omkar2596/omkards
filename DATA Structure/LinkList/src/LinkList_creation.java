import java.util.Scanner;

//video-8 singlu link list creation 
public class LinkList_creation {
	
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
	  Scanner sc = new Scanner(System.in);
	  
	  do
	  {  
	  System.out.print("enter dataa :");     
	  data = sc.nextInt();                
	  Node new_node = new Node(data);//line 6 la data transfer
	  if(head == null)                  //link list not exist node condition //means node nahi ahe
	  {
		 head = new_node;             //assign new node address to head
	  }
	  else                            //link list exist node condition //means node ahe
	  {
		  new_node.next=head;        //program first time run kelavr if condition run honar bez teva node empty ahe later only else through link list mdey element add honar
		  head=new_node;
	  }
	  System.out.print("do you want to continue:press enter 1:");
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
		LinkList_creation LL = new LinkList_creation();
		LL.creation();
		LL.traverser();
	}

}
