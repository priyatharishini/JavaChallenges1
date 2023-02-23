package javaChallenge4;

public class SingleOneValueInteger2
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
		int[] nums = {1};
		SingleOneValueInteger2 obj=new SingleOneValueInteger2();
		int result = obj.singleNumber(nums);
		System.out.println(result);
	}

}
