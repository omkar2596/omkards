//video 41 ...not complete
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {
	private LinkedList<Integer> adjacency[];
	public BFS_Traversal(int v)
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
	public void bfs(int source)
	{
		boolean visited_nodes[] = new boolean[adjacency.length];
		int paraent_nodes[] = new int [adjacency.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		visited_nodes[source] = true;
		paraent_nodes[source]=-1;
		while(!q.isEmpty())
		{
			int p = q.poll();
			System.out.println(p);
			for(int i:adjacency[p])
			{
				if(visited_nodes[i]=true)
				{
					visited_nodes[i]=true;
					q.add(i);
					paraent_nodes[i]=p;
				}
				
			}
		}
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
	        System.out.println("enter source for bfs traversal");
	        int source= sc.nextInt();
	        g.bfs(source);
	}

	}
