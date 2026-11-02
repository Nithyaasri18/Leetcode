class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int m=nums[nums.length/2];

        long count=0;
        for(int n:nums)
        {
            count+=Math.abs(n-m);
        }
        return (int)count;
        
    }
}