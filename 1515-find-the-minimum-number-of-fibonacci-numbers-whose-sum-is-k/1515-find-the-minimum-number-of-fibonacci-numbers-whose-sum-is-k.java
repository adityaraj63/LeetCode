class Solution {
    public int findMinFibonacciNumbers(int k) {
        List <Integer> list = new ArrayList<>();
        list.add(1);list.add(1);
        int index = 2;
        while ((list.get(list.size()-1)) < k) {
            int val = list.get(index-1) + list.get(index-2);
            list.add(val);
            index++;
        }
        int idx = list.size()-1;
        int count = 0;
        while (k > 0) {
            if (list.get(idx) <= k) {
                k -= list.get(idx);
                count++;
            }
            idx--;
        }
        return count;     
    }
}