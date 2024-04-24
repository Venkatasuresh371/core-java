package leetCodeProblems;

public class RemoveDuplicatesFromSortedArray 
{
	public static void main(String[] args)
	{
		int[] a = {1,1,2};
		int count = removeDuplicates(a);
		System.out.println(count);
		int count2 = removeDuplicates2(a);
		System.out.println(count2);
		
	}
	public static int removeDuplicates(int[] nums)
	{
		int count = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(i<nums.length-1 && nums[i]==nums[i+1])
				continue;
			else
			{
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
	public static int removeDuplicates2(int[] nums) {
        if(nums.length==1)
        return 1;
        int curr_pos=1,uniq_pos=0,counter=1;
        while(curr_pos<nums.length)
        {
            if(nums[curr_pos]==nums[uniq_pos])
            curr_pos++;
            else
            {
                nums[++uniq_pos]=nums[curr_pos];
                counter++;
                curr_pos++;
            }
        }
        return counter;
    }
}
