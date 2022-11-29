//Question 4: Check wheather the given number contains unique number or not.

class  Unique_No {
public static void main(String[] args) {
    Unique_No mn = new  Unique_No();
    
int[] intArray = {1,2,3,6,5,6};
boolean result = mn.isUnique(intArray);
System.out.println(result);
  }
public boolean isUnique(int[] intArray) {
for (int i =0; i<intArray.length; i++) {
for (int j = i+1; j<intArray.length; j++) {
if (intArray[i] == intArray[j]) {
return false;
        }
      }
    }
return true;
  }
}
