class Solution {
    public int subtractProductAndSum(int n) {

        int sum=0;
        int prd=1;

        while(n!=0)
        {
            int t=n%10;
            sum+=t;
            prd*=t;
            n=n/10;
        }
        return prd-sum;
        
    }
}