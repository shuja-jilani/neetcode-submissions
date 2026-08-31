class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0, k = 0;
        int[] v = new int[n1 + n2]; // Pure primitive array is faster than ArrayList

        while (i < n1 && j < n2) {
            v[k++] = (nums1[i] <= nums2[j]) ? nums1[i++] : nums2[j++];
        }
        while (i < n1) v[k++] = nums1[i++];
        while (j < n2) v[k++] = nums2[j++];

        int n = n1 + n2;
        return (n % 2 != 0) ? v[n / 2] : (v[n / 2] + v[n / 2 - 1]) / 2.0;
    }
}
