import java.util.HashSet;

public class JewelCnt {
    public static int countJewel(String J, String S){
        int jewelCnt=0;
        HashSet<Character> jewelSet=new HashSet<Character>();
        for(char c:J.toCharArray()){
            jewelSet.add(c);
        }
        for(char c:S.toCharArray()){
            if(jewelSet.contains(c)){
                jewelCnt++;
            }
        }
        return jewelCnt;
    }
    public static void main(String[] args){
        String J="z";
        String S="ZZ";
        System.out.println(countJewel(J,S));
    }
}
