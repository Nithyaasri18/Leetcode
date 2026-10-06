class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[]word=s.split(" ");
        if(pattern.length()!=word.length)
        {
            return false;
        }
        HashMap<Character,String>m1=new HashMap<>();
        HashMap<String,Character>m2=new HashMap<>();
        for(int i=0;i<word.length;i++)
        {
              
            char ch=pattern.charAt(i);
            String w=word[i];

            if(m1.containsKey(ch) && !(m1.get(ch).equals(w)))
            {
                return false;
            }

            if(m2.containsKey(w) && !(m2.get(w).equals(ch)) )
            {
                return false;
            }
            m1.put(ch,w);
            m2.put(w,ch);
        }
       return true; 
    }
}