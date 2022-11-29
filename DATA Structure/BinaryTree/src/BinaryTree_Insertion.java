import java.util.Scanner;

public class BinaryTree_Insertion {
	static Node1 create()
	{
		int data;
		Scanner sc = new Scanner(System.in);
		Node1 root=null;
		System.out.println("enter value:");
		data= sc.nextInt();
	    if(data == -1)
	    
	    	return null;
	    	root = new Node1(data);
	    	System.out.println("enter left child of: " +root.data);
	    	root.left = create();
	    	System.out.println("enter right child of: "+root.data);
	    	root.right = create();
	    	return root;
	     
	}


static void inorder(Node1 root)//L N R
{
	if(root == null)
		return;
	
	inorder(root.left);
	System.out.println(root.data);
	inorder(root.right);
}
static void preorder(Node1 root)//N L R
{
	if(root == null)
		return;
	System.out.println(root.data);
	preorder(root.left);
	preorder(root.right);
}
static void postorder(Node1 root)//L R N
{
	if(root == null)
		return;
	postorder(root.left);
	postorder(root.right);
	System.out.println(root.data);
}

	public static void main(String[] args) {
		Node1 root = create();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
	}
}


class Node1
{
	Node1 left,right;
	int data;
	public Node1(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
