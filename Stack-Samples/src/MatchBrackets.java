import java.util.Stack;

public class MatchBrackets {
    public static void main(String[] args){
        String spl="[(])";
        System.out.print(isMatching(spl));
    }
    public static boolean isMatching(String spl){
        Stack stack=new Stack();
        for (int i=0;i<spl.length();i++) {
            char c = spl.charAt(i);
            if(c == '[' || c == '('|| c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.empty()){
                return false;
            }
            char check;
            switch(c){
                case ']':
                    check = (char) stack.pop();
                    if(check == '('|| check =='{')
                        return false;
                        break;
                case ')':
                    check = (char) stack.pop();
                    if(check == '{'|| check =='[')
                        return false;
                    break;
                case '}':
                    check = (char) stack.pop();
                    if(check == '['|| check =='(')
                        return false;
                    break;

            }

        }
        return stack.isEmpty();
    }
}
