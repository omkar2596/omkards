//arrey simple
import java.util.Scanner;
import java.util.Arrays;

public class Arrey1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int myArrey[] = new int[size];
        
        for (int i = 0;i < size; i++)
        {
        	System.out.println("enter element " + (i+1) + ":");
        	myArrey[i] = sc.nextInt();
        }
        System.out.println("all element arrey="+Arrays.toString(myArrey));
     /*  //for loop pn vaprta yeto pn shotccut vaprla ahe '19' line la
        for(int i = 0;i < myArrey.length; i++)
        {
        	System.out.println(myArrey[i] +" ");
        }      
      */ 
	}

}
