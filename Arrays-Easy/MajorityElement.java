public class MajorityElement {
    public static int majorityElement(int[] nums){
        int n = nums.length;
        int halfn = n/2;
        int count = 0, majority = 0;
        for(int i = 0 ; i < n ; i++){                                      // Bruteforce O(n^2), can be optimized.
            for(int j = i + 1 ; j < n ; j++){
                if(nums[i] == nums[j]){
                    count++;
                    if(count > halfn){
                        majority = nums[i];
                    }
                }
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,3};
        int majority = majorityElement(nums);
        System.err.println("Majority Element = " + majority);
    }
}