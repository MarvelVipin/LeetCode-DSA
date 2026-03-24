public class MinOprDivByK {
    public static int minOperations(int[] nums, int k) {
        int sum = 0, minOpr = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum % k) != 0) {
            minOpr = sum % k;
        }
        return minOpr;
    }

    public static void main(String[] args) {
        int nums[] = { 3,2 };
        int k = 6;
        int minOpr = minOperations(nums, k);
        System.err.println("Output : " + minOpr);
    }
}
