class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int j = 0; // Pointer for the unique position
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { // Found a unique element
                j++;
                nums[j] = nums[i]; // Move it forward
            }
        }
        
        return j + 1; // Number of unique elements
}
}