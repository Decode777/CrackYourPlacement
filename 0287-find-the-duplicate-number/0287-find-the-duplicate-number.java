class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length-1;
        int [] arr = new int[n];  // hash table
        for(int i=0;i< nums.length;i++){
            arr[nums[i]-1]++;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>1){
                return i+1;
            }
        }
        return -1;
    }
}
