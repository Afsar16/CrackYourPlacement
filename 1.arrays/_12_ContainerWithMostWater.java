class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int length = height.length-1;
        int max = 0;

        while(i < j) {
            // int min = Math.min(height[i], height[j]);
            // int area = min * length;
            // max = Math.max(max, area);
            // length--;
            // or 
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
            
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return max;
    }
}

