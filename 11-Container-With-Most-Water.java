class Solution {
    public int maxArea(int[] height) {
    
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int leftheight=height[left];
            int rightheight=height[right];
            int width=right-left;
            int currarea=width*(Math.min(leftheight,rightheight));
            maxarea=Math.max(maxarea,currarea);
            if(leftheight<rightheight)
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;

        
    }
}