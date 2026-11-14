class Solution {
    public int countKDifference(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;

        for(int n:nums)
        {
            int t1=n-k;
            int t2=n+k;
            count+=map.getOrDefault(t1,0)+map.getOrDefault(t2,0);
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
        
    }
}