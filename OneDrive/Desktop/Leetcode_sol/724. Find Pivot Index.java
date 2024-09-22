class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int Leftsum = 0;
        for (int i = 0; i< nums.length; i++){
            sum -= nums[i];
            if(Leftsum == sum){
                return i;
            }
            Leftsum += nums[i];
        }
        return -1;
    }
}