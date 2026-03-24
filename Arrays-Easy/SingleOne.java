public class SingleOne {

    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 1, 2, 3 };
        int single = singleNumber(nums);
        System.out.println(single);
    }
}