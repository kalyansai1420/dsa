class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") ||s.equals("/")|s.equals("*")){
                int b = st.pop();
                int a = st.pop();
                int result = 0;
                switch(s){
                    case "+" :
                        result = a + b;
                        break; 
                    case "-" :
                        result = a - b;
                        break; 
                    case "/" :
                        result = a / b;
                        break; 
                    case "*" :
                        result = a * b;
                        break; 
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}