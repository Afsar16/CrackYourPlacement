// solution 1 // time limit exceeds - doesn't work
class Solution { 
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }
}

//  solution 2. Optimized Prefix Sum Approach without HashMap - i know this solution
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] modCount = new int[k];
        modCount[0] = 1;  // Initialize with prefix sum 0 having one count

        int sum = 0, result = 0;

        for (int num : nums) {
            sum += num;
            int mod = (sum % k + k) % k;  // Handle negative mod

            result += modCount[mod];  // Add the count of this mod to result
            modCount[mod]++;  // Update the count of this mod
        }

        return result;
    }
}


// solution 3. using hashmap 
// Map<Integer, Integer> prefixSumCount = new HashMap<>();
// prefixSumCount.put(0, 1);  // Initialize with prefix sum 0 having one count

// int sum = 0, result = 0;

// for (int num : nums) {
//     sum += num;
//     int mod = (sum % k + k) % k;  // Handle negative mod
    
//     if (prefixSumCount.containsKey(mod)) {
//         result += prefixSumCount.get(mod);  // Add the count of this mod to result
//     }
    
//     prefixSumCount.put(mod, prefixSumCount.getOrDefault(mod, 0) + 1);  // Update the count of this mod
// }

// return result;
