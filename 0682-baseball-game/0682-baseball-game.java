class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String el = operations[i];
            if(el.equals("+") || el.equals("D") || el.equals("C") )
                stackOp(st,el);
            else
                st.add(Integer.parseInt(el));
        }
        return sum(st);
    }
    static void stackOp(Stack<Integer> st, String op){
        if(op.equals("+")){
            int f = st.pop();
            int s = st.pop();
            st.add(s);
            st.add(f);
            st.add(f+s);
        }
        else if(op.equals("D"))
            st.add(st.peek()*2);
        else
            st.pop();
    }
    static int sum(Stack<Integer> st){
        int sum = 0;
        while(st.isEmpty()==false){
            sum+=st.pop();
        }
        return sum;
    }
}