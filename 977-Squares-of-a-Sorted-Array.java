class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]a=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int i=nums.length-1;
        while(l<=r)
        {
            int leftsquare=nums[l]*nums[l];
            int rightsquare=nums[r]*nums[r];
            if(leftsquare>rightsquare)
            {
                a[i]=leftsquare;
                l++;
            }
            else{
                a[i]=rightsquare;
                r--;
            }
            i--;
        }
        return a;
    }
}