package leetCodeProblems;

public class RemoveElementFromAnArray 
{
	public static void main(String[] args) 
	{
		int[] a = {0,1,2,2,3,0,4,2};
		int value = 2;
		int elements = removeElement(a, value);
		System.out.println(elements);
	}
	public static int removeElement(int[] nums, int val) 
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]= nums[i];
                count++;
            }
        }
        return count;
    }
}
