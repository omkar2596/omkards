
public class Exp1 {

	public static void main(String[] args) {
	//	System.out.println("Enter Positive No=");
		Exp1 m = new Exp1();
		
		int result =m.sum(5); 
		System.out.println("sum of" +result);
		

	}

	static int sum(int n)
	{
		if(n==0 || n<0)
		{
			return 0;
		}else
		{
			return n%10 + sum(n/10) ;
	    }
}
}
