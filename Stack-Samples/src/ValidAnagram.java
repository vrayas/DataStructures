import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean checkIsStingAnagram(String s1,String s2){
        HashMap<Character,Integer> s1Cnt=new HashMap<>();

        if(s1.length() != s2.length())
            return false;

        for(Character c:s1.toCharArray()){
            if(s1Cnt.containsKey(c)){
                s1Cnt.put(c,s1Cnt.get(c)+1);
            }else{
                s1Cnt.put(c,1);
            }
        }

        for(Character c:s2.toCharArray()){
            if(s1Cnt.containsKey(c)){
                s1Cnt.put(c,s1Cnt.get(c)-1);
            }else{
                s1Cnt.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : s1Cnt.entrySet()) {
            if(entry.getValue()>0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1="abc";
        String s2="cca";
        System.out.println(checkIsStingAnagram(s1,s2));
    }
}
