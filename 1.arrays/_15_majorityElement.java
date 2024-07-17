class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int votes = 0;
        int majority = 0;
        for(int i=0; i<n; i++) {
            if(votes == 0) {
                votes++;
                majority = nums[i];
            }
            else if(majority == nums[i]) {
                votes++;
            }
            else {
                votes--;
            }
        }
        return majority;
    }
}
