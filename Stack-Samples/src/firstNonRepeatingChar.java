import java.util.HashMap;


public class firstNonRepeatingChar {
    public static Character findFirstNonRepeatChar(String s){
        HashMap<Character,Integer> charCnt=new HashMap<>();

        for(Character c:s.toCharArray()){
            if(charCnt.containsKey(c)){
                charCnt.put(c,charCnt.get(c)+1);
            }else{
                charCnt.put(c,1);
            }
        }
        for(Character c:s.toCharArray()){
            if(charCnt.get(c)==1){
                return c;
            }
        }
        return '_';
    }
    public static void main(String[] args){
        System.out.println(findFirstNonRepeatChar("afteracademy"));
    }
}
