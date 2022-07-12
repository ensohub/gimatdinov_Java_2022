public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] arr = Arrays.copyOf( nums, len );
        
        for( int i = 0; i < len; i++){
            if( i < k ){
                nums[i] = arr[len - k + i];
            }else{
                nums[i] = arr[i - k];
            }
        }
        
    }
}