public class ArrayEx {
	int arr[] = null;//arrey creat kiya 
	
	public ArrayEx(int sizeOfArray) {
		
		arr = new int[sizeOfArray];//arrey la heap mdey memory milali
		for(int i = 0; i<arr.length;i++) {
			arr[i] = Integer.MIN_VALUE;					
		}		
	}
	
public void insert(int location, int valueToBeInserted) {
	try {
		if(arr[location] == Integer.MIN_VALUE) {
			arr[location] = valueToBeInserted;
			System.out.println("Successfully Inserted!!");
		}
		else {
			System.out.println("This location is already occupied!!");
		}
		
	}
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Invalid Index number provided????");
		
	}
	
}
}