class Solution {
    public boolean validMountainArray(int[] arr) {
        int mid=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[mid])
            {
                mid=i;
            }
        }
        if(arr.length<=2)
        {
            return false;
        }
        if(mid==0 || mid==arr.length-1){
                return false;
            }

        for(int i=1;i<=mid;i++)
        {
            if(!(arr[i]>arr[i-1]))
            {
                return false;
            }
        }
        for(int i=mid;i<arr.length-1;i++)
        {
            if(!(arr[i]>arr[i+1]))
            {
                return false;
            }
        }
        return true;
        
    }
}