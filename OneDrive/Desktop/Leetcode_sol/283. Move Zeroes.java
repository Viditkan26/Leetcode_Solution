class Solution {
    public void moveZeroes(int[] nums) {
        int last = -1;
        int k = nums.length;
        for (int i = 0; i < k; ++i){
            if(nums[i] != 0){
                last++;
            
            int temp  = nums[last];
            nums[last] = nums[i];
            nums[i] = temp;
            }
        }
    }
}