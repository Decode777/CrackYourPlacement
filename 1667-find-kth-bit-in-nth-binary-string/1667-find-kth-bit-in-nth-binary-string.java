class Solution {
//soolves using recursion
    public char findKthBit(int n, int k) {
        int len=(int)Math.pow(2,n)-1; // calculating length for nth string
        return rec(len,k);
    }
    public char rec(int len,int k){
        if (len==1){ //if its 1st element then the answer will be o as per the question
            return '0';
        }
        int half=len/2;  // calculating the half of the string
        int mid=half+1;  // calculating the middle element as it always will be odd
        if(k==mid){
            return '1'; // if we want the middle term then it will be 1, as per the question
        }
        else if(k<mid){  // if we need to search element which is smaller then mid, then it can be found in its previous string
            return rec(half,k);
        }
        else{// else it will be in its 2nd half string, which is reverse of its previous string
            char r=rec(half,len-k+1);
            return (r=='1')?'0':'1';
        }

    }
}