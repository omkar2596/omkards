import java.util.Scanner;

public class Arrey {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the element");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter value");
		for(int i=0; i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
hiiii this is omkar