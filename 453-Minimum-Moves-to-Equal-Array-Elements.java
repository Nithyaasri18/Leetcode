class Solution {
    public int minMoves(int[] nums) {
        int c=Integer.MAX_VALUE;

        for(int n:nums)
        {
            if(n<c)
            {
                c=n;
            }
            
        }
        long count=0;
            for(int j:nums)
            {
                count+=j-c;
            }
        
        return (int)count;


        
    }
}