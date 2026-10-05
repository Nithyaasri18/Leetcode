class Solution {
    public int scoreOfParentheses(String s) {

       /* Stack<Character>st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')

            {
                st.push(ch);
            }
            else if(ch==')'  && st.peek()=='(')
            {
                st.pop();
                c++;
            }
        }
        return c;*/

        Stack<Integer>st=new Stack<>();
        st.push(0);
      
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(0);
            }
            else if(ch==')')
            {
                int top=st.pop();
                int c=0;

                if(top==0)
                {
                    c=1;
                }
                else if(top>0)
                {
                    c=2*top;
                }
                int p=st.pop();
                st.push(p+c);
            }
        }
        return st.pop();
        
    }
}