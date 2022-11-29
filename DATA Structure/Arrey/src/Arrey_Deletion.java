import java.util.Scanner;

public class Arrey_Deletion {

	public static void main(String[] args) {
		int size,size2,value;
		System.out.println("Enter the element");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size-1];
		
		System.out.println("enter value");
		for(int i=0; i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index of value to be deleted");
		size2 = sc.nextInt();//index
		for(int i=0;i<a.length;i++)//a[10]=10 20 30 40 50  size2=2
		{
			if(i<size2)             //b[]=10 20
			{
				b[i]=a[i];
			}
			else if(i==size2)  //check sati ahe 
				continue;
			else
			{
				b[i-1]=a[i];//minus
			}
		}
		

		System.out.println("elements are");
		for(int i=0;i<size-1;i++)
		{
			System.out.println(b[i]);
		}


	}

}
