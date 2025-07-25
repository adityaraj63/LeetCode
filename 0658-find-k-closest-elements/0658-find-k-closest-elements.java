import java.util.*;
class Solution {
    public class Pair implements Comparable<Pair> {
        int ele;
        int diff;
        Pair(int ele, int diff) {
            this.ele = ele;
            this.diff = diff;

        }
        public int compareTo(Pair p) {
            if (this.diff == p.diff) return this.ele - p.ele;
            return this.diff - p.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // MAXHEAP:
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new Pair(ele, diff));
            if (pq.size() > k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (pq.size() > 0) {
            Pair p = pq.remove();
            ans.add(p.ele);
        }
        Collections.sort(ans);
        return ans;      
    }
}