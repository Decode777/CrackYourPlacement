class Solution {
    public int[] twoSum(int[] nums, int target) {
        for( int s = 0 , e = nums.length-1 ; s < nums.length/2 ; s++ , e-- ){

            for(int ss = s + 1, se = e - 1; ss < nums.length - s; ss++, se--){
                if(nums[s] + nums[ss] == target) return new int[] {s, ss};
                if(nums[e] + nums[se] == target) return new int[] {se, e};
            }
        }
        return new int[] {};
    }
}