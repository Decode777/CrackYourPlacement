class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i<n-1; i++){
            if(str.charAt(i)-'0' < str.charAt(i+1)-'0'){
                int max = 0;
                int maxi = 0;
                for(int j = i+1; j<n; j++){
                    if(str.charAt(j)-'0' >= max){
                        max = str.charAt(j)-'0';
                        maxi = j;
                    }
                }

                for(int j = 0; j<=i; j++){
                    if(str.charAt(j)-'0' < max){
                        str.setCharAt(maxi, str.charAt(j));
                        char c = Character.forDigit(max, 10);
                        str.setCharAt(j, c);
                        return Integer.valueOf(str.toString());
                    }
                }
            }
        }

        return num;
    }
}