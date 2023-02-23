package javaChallenge4;

public class SingleOneValueInteger {
	int result = 0;
	public int singleNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        result ^= nums[i];
    }
    return result;
	}
	public static void main(String[] args) 
	{
	int[]	nums = {2,2,1};

		SingleOneValueInteger solution = new SingleOneValueInteger();
		int result = solution.singleNumber(nums);
		System.out.println(result); 
		}
}

