class Solution {
    public int kthFactor(int n, int k) {
      //int [] arr = new int[k];
      int j=1;
      for(int i=1;i<=n;i++){
        if(n%i==0){
            
            if(j==k){
                return i;
            }
            j++;
        }
        
      }  
      return -1;
    }
}