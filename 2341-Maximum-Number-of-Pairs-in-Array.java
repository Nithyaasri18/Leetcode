class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[]ans=new int[2];
        int pair=0;
        int rem=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values())
        {
            ans[0]+=freq/2;
            ans[1]+=freq%2;
        }
        return ans;
    }
}