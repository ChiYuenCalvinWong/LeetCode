class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        int right = 0;
        int left = 0;
        for(int i = 0; i < result.length ; i++){
            right = result[result.length - 1] - result[i];
            if(left == right){
                return i;
            }
            left = result[i];
        }
        return -1;
    }
}
