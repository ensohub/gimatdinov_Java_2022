class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int cent = (left + right) / 2;
      if (nums[cent] == target) {
        return cent;
      } else if (nums[cent] > target) {
        right = cent - 1;
      } else {
        left = cent + 1;
      }
    }
    return left;
  }
}