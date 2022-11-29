import java.util.Scanner;

public class Two_dimesion_Arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        int m;
        int p;
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows");
        n = s.nextInt();
        
        System.out.println("enter coloum");
        m = s.nextInt();
        
        int[][] a = new int[n][m];
        System.out.println("enter value");
        
        for(int i=0; i < n; i++) //n=2,m=3
        {
        	for(int j=0; j < m; j++)
        	{
        		a[i][j]= s.nextInt();//a[0][0],a[0][1],a[0][2]
                      	}
        }
        for(int i=0; i < n; i++) //n=2,m=3
        {
        	for(int j=0; j < m; j++)
        	{
             System.out.println(a[i][j] +" ");    
        	}
        //	System.out.println(); //matrix format mde ans disnasti
        }
	}

}
