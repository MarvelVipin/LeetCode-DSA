public class RunningSum {
    public static int[] runSum(int nums[]){
        int n = nums.length;
        int[] runningSum = new int[n];
        int runSum = 0;
        for(int i = 0 ; i < n ; i++){
            runSum += nums[i];
            runningSum[i] = runSum;
        }
        return runningSum;
    }

    public static void main(String[] args) {
        int nums[] = {3,1,2,10,1};
        int runningSum[] = runSum(nums);
        for(int i = 0 ; i < runningSum.length ; i++){
            System.out.print(runningSum[i] + " ");
        }
    }
}