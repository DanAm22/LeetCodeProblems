public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return;
        }
        boolean zeroRow = false;
        boolean zeroCols = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    if(i == 0){
                        zeroRow = true;
                    }
                    if(j == 0){
                        zeroCols = true;
                    }
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(zeroRow){
            for(int k = 0; k < matrix[0].length; k++){
                matrix[0][k] = 0;
            }
        }

        if(zeroCols){
            for(int k = 0; k < matrix.length; k++){
                matrix[k][0] = 0;
            }
        }
        printArray(matrix);
    }

    public static void printArray(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}
