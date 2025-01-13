class Solution {
    public int minimumLength(String s) {
        int totfreq[] = new int[26];
        int totlen=0;
        for(char c:s.toCharArray()){
            totfreq[c-'a']++;
        }
        for(int freq:totfreq){
            if(freq==0) continue;
            if(freq%2==0){
                totlen+=2;
            }else{
                totlen+=1;
            }
        } 
        return totlen;
    }
}