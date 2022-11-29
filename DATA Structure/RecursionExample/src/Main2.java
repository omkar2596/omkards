//4)How to convert a number from Decimal to Binary using recursion


import java.util.*;
public class Main2 
{
  public static void main(String[] args) 
  {
    Main2 m = new Main2();
   int result = m.decimalToBinary(10);
   System.out.println( result);
  }

 public int decimalToBinary(int n) {
	if(n == 0) {
		return 0;
	}
	
	return n%2 + 10*decimalToBinary(n/2);
 }
}