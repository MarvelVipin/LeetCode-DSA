public class MinOprDivByThree {
    public static int minimumOperations(int[] nums) {
        int opr = 0;
        for (int i = 0 ; i < nums.length ; i++ ){
            if ((nums[i]%3) != 0){
                if (((nums[i]-1)%3) != 0){
                     opr++;
                }
                else {
                     opr++;
                }
            }
        }
        return opr;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int minOpr = minimumOperations(nums);
        System.err.println(minOpr);
    }
}