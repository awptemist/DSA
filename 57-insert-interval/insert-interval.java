import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(); 
        boolean added = false; 
        for (int[] interval : intervals) {
           
            if (interval[1] < newInterval[0]) {
                result.add(interval); 
            }
            
            else if (interval[0] > newInterval[1]) {
                if (!added) {
                    result.add(newInterval); 
                    added = true; 
                }
                result.add(interval); 
            }
            
            else {
                
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
                
            }
        }

        
        if (!added) {
            result.add(newInterval);
        }

        
        return result.toArray(new int[result.size()][]);
    }
}
