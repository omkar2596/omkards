

//1) Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

import java.util.Scanner;
import java.util.Arrays;
public class Recursion_Assignment {

	public static void main(String[] args) {
		int size ;
		Recursion_Assignment fun = new Recursion_Assignment();
		System.out.println("Enter the element");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr = new int[size];
		
		int product = 1;
	      System.out.println("Enter the elements of the array one by one ");
	      for(int i=0; i<size; i++){
	         arr[i] = sc.nextInt();
	         product = product * arr[i];
	      }
	      System.out.println("Elements of the array are: " +Arrays.toString(arr));
	      System.out.println("Sum of the elements of the array ::"+product);

	}
}
