public class ArrayByParity { 

    public static void main(String[] args) {
        int[] nums = { 0,1,0,1 };
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] < nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.err.println(nums[i]+" ");
        }
    }
}
