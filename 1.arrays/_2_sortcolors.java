class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int m = 0;
        int e = nums.length - 1;

        while(m <= e) {
            switch(nums[m]) {
                case 0: 
                    swap(nums, s, m);
                    m++;
                    s++;
                    break;
                case 1: 
                    m++;
                    break;
                case 2:
                    swap(nums, m, e);
                    e--;
                    break;
            }
        }
    }

    public void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}