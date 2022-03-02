import java.util.Arrays;
import java.util.Stack;

public class SymmetricDifferent{
    public static void main(String[] args){
        int[] intArray = new int[]{ 1,2,5};
        int[] intArray2 = new int[]{ 2,3,4};

        SymmetricDifferent.symm(intArray, intArray2);

    }
    public static void symm(int[] arrayOne, int[] arrayTwo){
        int oneLength=arrayOne.length;
        int twoLength=arrayTwo.length;
        int i=0;
        int j=0;
        while(i<oneLength && j<twoLength){
            if(arrayOne[i]<arrayTwo[j]){
                System.out.print(arrayOne[i]+" ");
                i++;
            }else if(arrayTwo[j]<arrayOne[i]){
                System.out.print(arrayTwo[j]+" ");
                j++;
            }else{
                i++;
                j++;
            }
        }
        while(i<oneLength){
            System.out.print(arrayOne[i]+" ");
            i++;
        }
        while(j<twoLength){
            System.out.print(arrayTwo[j]+" ");
            j++;
        }
    }
}