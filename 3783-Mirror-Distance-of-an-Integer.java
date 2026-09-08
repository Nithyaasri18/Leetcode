class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int og=n;
        while(og>0)
        {
            int d=og%10;
            rev=rev*10+d;
            og=og/10;
        }
        return Math.abs(n-rev);

        
    }
}