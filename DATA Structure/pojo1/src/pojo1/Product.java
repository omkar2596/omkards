package pojo1;




import java.util.Scanner;
import java.util.Vector;

public class Product
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Vector objVector = new Vector();
		int choice = 0;
		while(choice != 3)
		{
			// Menu
			System.out.println("Menu:");
			System.out.println("1.Add product\n2.Display all products\n3.Exit");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			switch(choice)
			{
			case 1:
				//Add
				System.out.println("Enter CAT ID : ");
				int catId = scanner.nextInt();
				
				System.out.println("Enter Product ID: ");
				int productId = scanner.nextInt();
				
				System.out.println("Enter Product Name : ");
				String productName = scanner.next();
				
				System.out.println("Enter Product Description : ");
				String productDescription = scanner.next();
				
				System.out.println("Enter the Price of the Product: ");
				float price = scanner.nextFloat();
				Details objDetails = new Details(catId,productId,productName,productDescription,price);
				objVector.add(objDetails);
				break;
				
			case 2:
				//Display
				int countManager = 0;
				objDetails = (Details) objVector.get(countManager);
				try
				{
					while(objVector.get(countManager)!=null)
					{
						System.out.println("Category ID: " + objDetails.getCatId());
						System.out.println("Product ID: " + objDetails.getProductId());
						System.out.println("Product Name: " + objDetails.getProductName());
						System.out.println("Product Description: " + objDetails.getProductDesc());
						System.out.println("Product Price: " + objDetails.getProductPrice());
						countManager++;
					}
				} catch (Exception e)
				{
				}
				break;	
			}
			
		}
	}

}
