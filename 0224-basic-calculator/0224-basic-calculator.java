class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0, num = 0, sign = 1;

        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                st.push (result);
                st.push (sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= st.pop();
                result += st.pop();
            }
            
        }
        result += sign * num;       
        return result;         
    }
}