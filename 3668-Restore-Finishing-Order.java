class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[]ans=new int[friends.length];

        HashSet<Integer>set=new HashSet<>();
        for(int n:friends)
        {
            set.add(n);
        }
        int i=0;

        for(int n:order)
        {
            if(set.contains(n))
            {
                ans[i]=n;
                i++;
            }
        }
        return ans;

        
        
    }
}