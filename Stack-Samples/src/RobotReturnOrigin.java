public class RobotReturnOrigin {
    public static boolean findRobotStatus(String s){
        int ud=0;
        int lr=0;
        for(Character currentMove:s.toCharArray()){
            if(currentMove == 'U'){
                  ud++;
            }else if(currentMove == 'D'){
                ud--;
            }else if(currentMove == 'L'){
                lr++;
            }else if(currentMove == 'R'){
                lr--;
            }
        }
        return ud == 0 && lr==0;

    }
    public static void main(String[] args){
        String s="LL";
        System.out.println(findRobotStatus(s));
    }
}
