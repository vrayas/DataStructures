public class BalancedString {
    public static int balancedStringCount(String s){
        int balancedCnt=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(current == 'L'){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == 0){
                balancedCnt++;
            }
        }
        return balancedCnt;
    }
    public static void main(String[] args){
        System.out.println(balancedStringCount("LLRRRLLRRL"));
    }
}
