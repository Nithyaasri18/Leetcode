class Solution {
    public int maxDepth(String s) {
        
       int ans=0;
       int d=0;

       for(char ch:s.toCharArray())
       {
        if(ch=='(')
        {
            d+=1;
        }
        if(ch==')')
        {
            d-=1;
        }
        ans=Math.max(ans,d);
       }
       return ans;
    }
}