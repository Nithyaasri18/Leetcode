class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            //int b=0;
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    c++;
                    baskets[j]=-1;
                    break;
                }
                
                    
            }
        
        }
        return n-c;
        
    }
}