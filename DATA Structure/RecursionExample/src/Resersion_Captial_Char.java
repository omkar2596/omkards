import java.io.IOException;
import java.util.Scanner;

/*
 * 4.) Implement a function that capitalizes first char of each word in String.
Example
1.	input: i love my india
2.	output : I Love My India
 */
	public class Resersion_Captial_Char  
	{  
	public static void main(String args[])   
	{  
	System.out.println(capitalize("i love my india"));     
	System.out.println(capitalize("website"));          
	System.out.println(capitalize("@javatpoint"));    
	System.out.println(capitalize("it is the best website to learn technology."));   
	}  

	
	
	public static final String capitalize(String str)   
	{  
	if (str == null || str.length() == 0) return str;  
	return str.substring(0, 1).toUpperCase() + str.substring(1);  
	}  
	}  