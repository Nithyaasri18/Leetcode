class Solution {
    public int findPermutationDifference(String s, String t) {
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
        
            sum+=Math.abs(i-t.indexOf(ch1));
        }
        return sum;
    }
}