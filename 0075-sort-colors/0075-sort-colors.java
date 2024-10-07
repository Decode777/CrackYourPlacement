class Solution {
    public void sortColors(int[] nums) {
        //Bubble sort
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(nums[j-1]>nums[j]){
                    nums[j]^=nums[j-1];
                    nums[j-1]^= nums[j];
                    nums[j]^=nums[j-1];
                    //orelse Arrays.sort(nums);
                }
            }
        }
    }
}