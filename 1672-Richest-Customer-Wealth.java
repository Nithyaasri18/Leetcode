class Solution {
    public int maximumWealth(int[][] accounts) {
       
       int c1=0;
       for(int i=0;i<accounts.length;i++)
       {
        int c2=0;
        for(int j=0;j<accounts[i].length;j++)
        {
            c2+=accounts[i][j];
        }
        c1=Math.max(c1,c2);
       }
       return c1;
    }
}