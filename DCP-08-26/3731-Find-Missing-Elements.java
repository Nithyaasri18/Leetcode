class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int i=min;i<max;i++)
        {
            boolean found=false;
            for(int num:nums)
            {
                if(num==i)
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                list.add(i);
            }
        }
        return list;
    }
}