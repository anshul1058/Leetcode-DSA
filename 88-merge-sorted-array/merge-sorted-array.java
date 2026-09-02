class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            arr[count] = nums1[i];
            count++;
        }

        for (int i = 0; i < n; i++) {
            arr[count] = nums2[i];
            count++;
        }

        Arrays.sort(arr);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}