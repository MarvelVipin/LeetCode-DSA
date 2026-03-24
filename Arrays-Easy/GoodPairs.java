public class GoodPairs {
    public static int goodPairs(int[] nums){
        int count = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int temp = nums[i];
            for(int j = i+1 ; j < n ; j++) {
                if(temp == nums[j]){
                    count++;
                }
            }  
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int goodPair = goodPairs(nums);
        System.err.println("Number of good pairs = " + goodPair);
    }
}