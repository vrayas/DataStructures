public class reverseString {
    public static void main(String[] args){
        String s="Greek";
        String reverse="";
        for(Character c:s.toCharArray()){
            reverse=c+reverse;
        }
        System.out.println(reverse);
    }
}
