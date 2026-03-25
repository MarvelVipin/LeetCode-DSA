public class MissingAndRepeat {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;
        int len = n * n - 1 ; 

        for(int i = 0 ; i < len ; i++){
            for(int j = i + 1 ; j < len ; j++){
                int temp = matrix[i][j];
                System.out.println(temp);;
            }
        }
    }
}
