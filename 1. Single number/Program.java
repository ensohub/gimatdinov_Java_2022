public class Solution {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        int len = nums.length;
        for( int i = 1; i < len; i++ ){
            result = result ^ nums[i];
        }
        return  result;
    }
}
