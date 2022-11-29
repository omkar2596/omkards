import java.util.Scanner;

public class Arrey_Insertion {

	public static void main(String[] args) {
		int size,size2,value;
		System.out.println("Enter the element");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size+1];
		System.out.println("enter value");
		for(int i=0; i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index of new value to be inserted");
		size2 = sc.nextInt();
		System.out.println("enter new value of inserted");
		value = sc.nextInt();
		for(int i=0;i<size+1;i++)//10 20 30 40 50
		{
			if(i<size2)           //10 20 80
			{
			b[i]=a[i];	
			}
			else if(i==size2)
			{
				b[i]= value;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.println("elements are");
		for(int i=0;i<size+1;i++)
		{
			System.out.println(b[i]);
		}

	}

}
