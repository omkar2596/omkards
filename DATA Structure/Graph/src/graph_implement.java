
//video 40
//graph implement using adjacency list
import java.util.Scanner;
import java.util.LinkedList;

public class graph_implement {
	private LinkedList<Integer> adjacency[];
	public graph_implement(int v)
	{
		adjacency = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adjacency[i] = new LinkedList<Integer>();
		}
}
	public void insertedge(int s,int d)
	{
		adjacency[s].add(d);
		adjacency[d].add(s);
		System.out.println(adjacency[d]);
		System.out.println(adjacency[s]);
	}


	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.println("enter no of vertices abd edges");
     int v = sc.nextInt();
     int e = sc.nextInt();
     graph_implement g=new graph_implement(v);
     System.out.println("enter edges");
     for(int i=0;i<e;i++)
     {
    	 int s=sc.nextInt();
    	 int d=sc.nextInt();
    	 g.insertedge(s,d);
     }
	}


}