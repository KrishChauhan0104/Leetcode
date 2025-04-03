class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) { 
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int left = 0, right = m, halfLen = (m + n + 1) / 2;
        
        while (left <= right) {
            int i = (left + right) / 2; 
            int j = halfLen - i; 

            int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (nums1LeftMax <= nums2RightMin && nums2LeftMax <= nums1RightMin) {
                
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1LeftMax, nums2LeftMax); 
                }
                return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
            } else if (nums1LeftMax > nums2RightMin) {
                right = i - 1;  
            } else {
                left = i + 1; 
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted or valid");
    }
}