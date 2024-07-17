// my solution
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();

        for(int num: nums) {
            if(hash.contains(num)) {
                res.add(num);
            }
            else {
                hash.add(num);
            }
        }
        return res;
    }
}

// actual solution
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // HashSet<Integer> hash = new HashSet<>();

        for(int i=0; i<nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0) {
                res.add(index + 1);
            }
            nums[index] = nums[index] * -1;
        }
        return res;
    }
}