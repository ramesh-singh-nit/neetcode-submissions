class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();

        for(String s: tokens){
            if(isOperator(s)){
                int b= stack.pop();
                int a= stack.pop();
                stack.push(performOperation(s, a, b));
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

        private boolean isOperator(String s){
            if(s.equals("+") || s.equals("-")
            || s.equals("*") || s.equals("/")){
                return true;
            }
            return false;
        }

        private int performOperation(String operator, int a , int b){
           switch (operator){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
            default: throw new IllegalArgumentException("Illegal operator.");
           }
        }
        
    }

