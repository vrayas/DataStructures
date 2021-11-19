import java.util.Stack;

public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        Stack<Character> reverse=new Stack<>();
        for(Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                reverse.push(c);
        }
        for(Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                if(reverse.pop().compareTo(c)!=0){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s.toLowerCase().replaceAll("\\s","")));
    }
}
