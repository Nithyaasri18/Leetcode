class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=target-nums[i];
            if(n.containsKey(j))
            {
                return new int[]{n.get(j),i};
            }
            n.put(nums[i],i);
        }
        return new int[]{};
    }
}