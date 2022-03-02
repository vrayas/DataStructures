import java.util.HashMap;
import java.util.Map;

public class Update2DArray {
    public static void main(String[] args){
        Map<String,Integer> currentInv= new HashMap<String,Integer>(){{
            put("Bowling Ball",21);
            put("Dirty Sock",2);
            put("Hair Pin",1);
            put("Microphone",5);
        }};
        Map<String,Integer> newInv= new HashMap<String,Integer>(){
            {
                put("Hair Pin",2);
                put("Half-Eaten Apple",3);
                put("Bowling Ball",67);
                put("Toothpaste",7);
            }};
        updateInventory(currentInv,newInv);
    }
    public static void updateInventory(Map<String,Integer> currentInv,Map<String,Integer> newInv) {
        Map<String, Integer> resultInv = new HashMap<>();
        currentInv.forEach((k, v) -> resultInv.put(k, v));
        newInv.forEach((k, v) -> {
            if (resultInv.containsKey(k)) {
                int cnt = resultInv.get(k);
                int newCnt = cnt + v;
                resultInv.replace(k, newCnt);
            } else {
                resultInv.put(k, v);
            }
        });
        System.out.println(resultInv);
    }
}
