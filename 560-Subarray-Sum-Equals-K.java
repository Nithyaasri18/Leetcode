class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int cs=0;
        int count=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums)
        {
            cs+=num;

            if(map.containsKey(cs-k))
            {
                count+=map.get(cs-k);
                
            }
            map.put(cs,map.getOrDefault(cs,0)+1);
        }
        return count;
        
    }
}