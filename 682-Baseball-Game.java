class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>st=new Stack<>();

        int sum=0;

        for(String ch:operations)
        {
            if(ch.equals("+"))
            {
                int top=st.pop();
                int newtop=top+st.peek();
                st.push(top);
                st.push(newtop);
            }
            else if(ch.equals("C"))
            {
                sum=sum-st.pop();
                continue;
            }
            else if(ch.equals("D"))
            {
                st.push(2*st.peek());
            }
            else{
                st.push(Integer.valueOf(ch));
            }
            sum+=st.peek();
        }
        return sum;
    }
}