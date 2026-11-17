class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();

        while(n!=1 && !set.contains(n))
            {
                set.add(n);

                int sum=0;
                int t=n;

                while(t!=0)
                    {
                     int d=t%10;
                     sum+=d*d;
                        t=t/10;
                    }
                n=sum;
            }
        if(n==1)
        {
            return true;
        }
        return false;
        
    }
}