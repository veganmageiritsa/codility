package grokking.merge_intervals;

import java.util.*;
import java.util.stream.Collectors;

public class MergeIntervals {
    public static void main(String[] args) {

    }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> mergedIntervals = new LinkedList<Interval>();
        List<Interval> sortedIntervals = intervals
                .stream()
                .sorted(Comparator.comparing(a -> a.start))
                .collect(Collectors.toList());


        Iterator<Interval> intervalIterator = sortedIntervals.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;
        while ((intervalIterator.hasNext())){
             interval = intervalIterator.next();
             if(interval.start<= end){
                 end = Math.max(interval.end, end);
             }else {
                 mergedIntervals.add(new Interval(start,end));
                 start = interval.start;
                 end = interval.end;
             }
        }
        mergedIntervals.add(new Interval(start,end));
        return mergedIntervals;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> mergedIntervals = new ArrayList<>();
        Iterator<Interval> intervalIterator = intervals.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;
        while ((intervalIterator.hasNext())){
            interval = intervalIterator.next();
            if(interval.start <= newInterval.end){
                end = Math.max(newInterval.end, end);
            }else {
                mergedIntervals.add(new Interval(start,end));
                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Interval(start,end));
        return mergedIntervals;
    }

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

    }
}
