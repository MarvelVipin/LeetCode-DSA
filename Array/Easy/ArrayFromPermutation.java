class ArrayFromPermutation {
    public static int[] ArrFromPerm(int num[]){
        int ans[] = new int[num.length];
        for(int i = 0 ; i < num.length ; i++){
            ans[i]=num[num[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int num[]={0,1,2,5,3,4};
        int res[] = ArrFromPerm(num);
        for (int i = 0 ; i < res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}