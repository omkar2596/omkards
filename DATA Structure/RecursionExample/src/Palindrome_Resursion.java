import java.util.Scanner;

/*3.) Write a recursive function called is Palindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.
Examples
1.	isPalindrome('awesome') # false
2.	isPalindrome('foobar') # false
3.	isPalindrome('tacocat') # true
4.	isPalindrome('amanaplanacanalpanama') # true
5.	isPalindrome('amanaplanacanalpandemonium') # false
*/


public class Palindrome_Resursion {
	
	static boolean checkPalindrome(String str) {
		int n = str.length();
		if(n == 0)  //string is empty then its plaindrome
		return true;
		return checkPalindrome1(str,0,n-1);
	}
	
	static boolean checkPalindrome1(String str,int s,int e) {
	 if(s == e)//if there are only one char
		 return true;
	 //if first and last char do not match
	 if ((str.charAt(s)) !=(str.charAt(e)))
			 return false;
	 // If there are multiple characters, check if 
     // middle substring is also palindrome or not. 
     if (s < e + 1) 
         return checkPalindrome1(str, s + 1, e - 1);   
     return true; 
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");//user kadun ip gaych asel tr
		String str = sc.next();
		
	
		if(checkPalindrome(str))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
		
	}

}
