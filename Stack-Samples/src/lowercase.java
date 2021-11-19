public class lowercase {
    public static String lowerCaseStr(String s){
        String result="";
        for(Character c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                result+=(char)(c+32);
            }else{
                result+=c;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(lowerCaseStr("LovablE"));
    }
}
