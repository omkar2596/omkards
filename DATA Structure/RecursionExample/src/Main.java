//1)How to find the sum of digits of a positive integer number using recursion ?
		
import java.util.*;
public class Main 
{
  public static void main(String[] args) 
  {
    Main m = new Main();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value: ");
    int value = sc.nextInt();
   int result = m.sumofDigits(value);
    System.out.println("sum of digits "+ value + "= " + result);
  }

 public int sumofDigits(int n) {
	 if(n == 0 || n < 0) {
		 return 0;
		 
	 }
	 else {
		 return n%10 + sumofDigits(n/10);//123=1+2+3=6
	 }
 }
}