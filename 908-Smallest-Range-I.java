class Solution {
    public int smallestRangeI(int[] nums, int k) {
        

        int min=nums[0];
        int max=nums[0];

        for(int n:nums)
        {
            if(n<min)
            {
                min=n;
            }
            if(n>max)
            {
                max=n;
            }
        }

        int d=(max-k)-(min+k);
        return Math.max(0,d);
    }
}