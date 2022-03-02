import java.util.*;

class Interval{
    int start;
    int end;
    Interval(int s,int e){start=s;end=e;}
}
public class FreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> timeList){
        List<Interval> res=new ArrayList<>();

        if(timeList == null || timeList.size()==0){
            return res;
        }
        List<Interval> subList=new ArrayList<>();
        for(List<Interval> time:timeList){
            for(Interval interval:time) {
                subList.add(interval);
            }
        }
        Collections.sort(subList,new Comparator<Interval>(){
            @Override
            public int compare(Interval i1,Interval i2){
                return i1.start==i2.start?i1.end-i2.end:i1.start-i2.start;
            }
        });
        PriorityQueue<Integer> endTime=new PriorityQueue<>(Collections.reverseOrder());
        endTime.add(subList.get(0).end);

        for(int i=0;i<= subList.size();i++){
            if(endTime.size()>0 && endTime.peek() < subList.get(i).start){
                res.add(new Interval(endTime.peek(),subList.get(i).start));
            }
            endTime.add(subList.get(i).end);
        }
        return res;
    }
    public static void main(String[] args){



    }
}
