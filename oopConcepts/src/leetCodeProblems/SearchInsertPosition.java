package leetCodeProblems;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] a = {1,3,5,6};
		int target = 7;
		int insertPosition = searchInsert(a, target);
		System.out.println(insertPosition);
	}

	public static int searchInsert(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				break;
			}
			else
				count++;
		}
		return count;
	}
}
