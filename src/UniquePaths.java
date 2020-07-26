public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
                }
            }
        }
        return matrix[n-1][m-1];
    }

    public static void main(String[] args) {
        int n = 7;
        int m = 3;
        int result = uniquePaths(m,n);
        System.out.println(result);
    }
}
