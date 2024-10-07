class Solution {
    public int removeDuplicates(int[] nums) {
        int newnum=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
       if(nums[i]!=newnum){
        nums[count]=nums[i];
        count++;
        newnum=nums[i];
       }
        }
        return count;
    }
}