import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int Output = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i); // Push index of '('
            } else {
                st.pop(); // Pop the last index

                if (st.isEmpty()) {
                    st.push(i); // Push current index as a base for future valid substrings
                } else {
                    Output = Math.max(Output, i - st.peek());
                }
            }
        }
        return Output;
    }
}
