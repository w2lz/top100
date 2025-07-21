import java.util.ArrayList;
import java.util.List;

public class Merge {

    public static class Interval {
        int start;
        int end;
        Interval() {
            start = 0;
            end = 0;
        }
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval>  result = new ArrayList<>();
        intervals.sort((a, b) -> a.start - b.start);
        for (Interval in : intervals) {
           int n = result.size();
           if (result.isEmpty() || result.get(n-1).end < in.end) {
               result.add(in);
           } else {
               result.get(n-1).end = Math.max(result.get(n-1).end, in.end);
           }
        }
        return result;
    }
}
