//2.) Write a recursive function called reverse which accepts a string and returns a new string in reverse order.
//Examples
//1.	reverse('data')        // atad
//2.	reverse('structure')      //  erutcurts
//3.	reverse(‘algorithm’)   // mhtirogla


public class Reverse_Recersion  
{  
//recursive function to reverse a string      
public String reverseString(String str)  
{  
//checks if the string is empty   
if(str.isEmpty())  
{  
System.out.println("String is empty.");
                                          //if the above condition is true returns the same string      
return str;  
}   
else   
{  
return reverseString(str.substring(1))+str.charAt(0);  
}  
}  
public static void main(String[] args)   
{  
	Reverse_Recersion rs = new Reverse_Recersion();  
String resultantSting1 = rs.reverseString("DATA");  
String resultantSting2 = rs.reverseString("Structure");  
String resultantSting3 = rs.reverseString("Algorithm");  
System.out.println("DATA reverse="+resultantSting1);  
System.out.println("Structure="+resultantSting2);  
System.out.println("Algorithm="+resultantSting3);   
}  
}  
