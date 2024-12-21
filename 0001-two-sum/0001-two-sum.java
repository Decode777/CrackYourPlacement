class Solution {
    public int[] twoSum(int[] nums, int target) {
        for( int i = 0 , j = nums.length-1 ; i < nums.length/2 ; i++ , j-- ){

            for(int k = i + 1, m = j - 1; k < nums.length - i; k++, m--){
                if(nums[i] + nums[k] == target) return new int[] {i, k};
                if(nums[j] + nums[m] == target) return new int[] {m, j};
            }
        }
        return new int[] {};
    }
}