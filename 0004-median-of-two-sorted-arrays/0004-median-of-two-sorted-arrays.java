class Solution {
    public static double findMedian(int [] mergedArray) {
        int len = mergedArray.length;
        if (len % 2 == 1) {
            return mergedArray[len / 2];
        }else {
            int mid1 = mergedArray[len/2-1];
            int mid2 = mergedArray[len/2];
            return (mid1 + mid2) / 2.0;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length;
        int [] mergedArray = new int[m+n];
        for (int i = 0; i < m; i++){
            mergedArray[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            mergedArray[i+m] = nums2[i];
        }
        Arrays.sort(mergedArray);
        return findMedian(mergedArray);
    }
}