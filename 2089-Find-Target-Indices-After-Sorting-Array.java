class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer>List=new ArrayList<>();
       /* Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                List.add(i);
            }
        }
        return List; */

        int l=0;
        int eq=0;

        for(int a:nums)
        {
            if(a<target)
            {
                l++;
            }
            else if(a==target)
            {
                eq++;
            }
        }
        for(int i=0;i<eq;i++)
        {
            List.add(l+i);
        }
        return List;
    }
}