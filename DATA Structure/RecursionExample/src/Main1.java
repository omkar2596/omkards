//3)How to find GCD ( Greatest Common Divisor) of two numbers using recursion?


import java.util.*;
public class Main1
{
  public static void main(String[] args) 
  {
    Main1 m = new Main1();
   int result = m.gcd(100,10);
   System.out.println( result);
  }

 public int gcd(int a, int b) {
	if(b == 0) {                                //b zero asel tr 
		return a;
	}
	if(a< 0 || b < 0) {                         //value negative asel tr
		System.out.println("value is negative");
		return -1;

	}
	return gcd(b,a%b);                           //value regular astil tr
 }
}