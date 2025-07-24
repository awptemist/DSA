import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> allIntervals = new ArrayList<>();

        // Step 1: Insert newInterval in sorted order
        boolean inserted = false;
        for (int[] interval : intervals) {
            if (!inserted && newInterval[0] < interval[0]) {
                allIntervals.add(newInterval);
                inserted = true;
            }
            allIntervals.add(interval);
        }
        // If not yet inserted (i.e., it belongs at the end)
        if (!inserted) {
            allIntervals.add(newInterval);
        }

        // Step 2: Merge overlapping intervals
        List<int[]> result = new ArrayList<>();
        for (int[] interval : allIntervals) {
            // If result is empty OR no overlap with last added interval
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Overlap — merge with last interval
                int[] last = result.get(result.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
