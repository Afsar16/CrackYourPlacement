class Solution {
    public boolean canJump(int[] nums) {
        int lastReachable = 0; // Initialize the farthest index that can be reached
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the farthest reachable index, return false
            if (i > lastReachable) {
                return false;
            }
            // Update the farthest reachable index
            lastReachable = Math.max(lastReachable, i + nums[i]);
            // If the farthest reachable index is greater than or equal to the last index, return true
            if (lastReachable >= nums.length - 1) {
                return true;
            }
        }
        
        return false;
    }
}
