class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        int[]ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i).getKey();
        }
        return ans;
    }
}