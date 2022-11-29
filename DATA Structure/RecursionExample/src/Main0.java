//2)How to calculate power of a number using recursion?


import java.util.*;
public class Main0 
{
  public static void main(String[] args) 
  {
    Main0 m = new Main0();
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the value: ");
//    int value = sc.nextInt();
   int result = m.power(2,5);
   System.out.println( result);
  }

 public int power(int base, int exp) {
	if(exp < 0) {
		return -1;
	}
	if(exp == 0 || exp == 1) {
		return base;
	}
	return base * power(base,exp-1);//2*(2,5-1)=32
 }
}
