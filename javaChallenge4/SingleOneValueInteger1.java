package javaChallenge4;

public class SingleOneValueInteger1 
{
	int result = 0;
	public int singleNumber(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        result ^= nums[i];
    }
    return result;
}
	public static void main(String[] args)
	{
	int[] nums = {4, 1, 2, 1, 2};
	SingleOneValueInteger1 solution = new SingleOneValueInteger1();
	int result = solution.singleNumber(nums);
	System.out.println(result); 
	}

}
