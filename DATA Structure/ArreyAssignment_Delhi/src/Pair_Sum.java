//Question 3: Pair two sum of the target number from the array.

//[2, 6, 3, 9, 11]	9	[6,3]


import java.util.Arrays;

class Pair_Sum {
public static void main(String[] args) {
	Pair_Sum mn = new Pair_Sum();
	
int[] intArray = {2,6,3,9,11};
int[] result = mn.twoSum(intArray, 9);

System.out.println(Arrays.toString(result));
}
public int[] twoSum(int[] nums, int target) {
for (int i=0; i<nums.length; i++) {
for (int j = i+1; j<nums.length; j++) {
if (nums[i]+nums[j]==target) {
return new int[] { i, j};
        }
      }
    }
throw new IllegalArgumentException("No solution found");
  }
}
