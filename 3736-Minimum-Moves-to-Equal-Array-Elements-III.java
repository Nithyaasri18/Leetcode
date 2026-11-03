class Solution {
    public int minMoves(int[] nums) {

        int max=Integer.MIN_VALUE;

        for(int n:nums)
        {
            if(n>max)
            {
                max=n;
            }
        }
        int c=0;
        for(int j:nums)
        {
                while(j!=max)
                {
                    c++;
                    j++;
                }
        }
        return c;
        
    }
}