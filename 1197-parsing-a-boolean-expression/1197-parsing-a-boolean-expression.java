class Solution {
    public boolean parseBoolExpr(String expression) {
        int n=expression.length();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<n;i++){
            char c=expression.charAt(i);
            if(c!=')'&&c!=','){
                s.push(c);
            }else if (c == ')'){
                ArrayList<Character> a=new ArrayList<>();
                while(s.peek()!='('){
                    a.add(s.pop());
                }
                s.pop();
                char ans=find(a,s.pop());
                s.push(ans);
            }
        }
        if(s.peek()=='t')return true;
        else return false;
    }
    public char find(ArrayList<Character> a,char op){
        if(op=='&'){
            if(a.contains('f'))return 'f';
            else return 't';
        }else if(op=='|'){
            if(a.contains('t'))return 't';
            else return 'f';
        }else if(op=='!'){
            if(a.get(0)=='t')return 'f';
            else return 't';
        }
        return 'x';
    }
}