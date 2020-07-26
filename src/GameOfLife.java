import java.util.Arrays;

public class GameOfLife {
    public static void gameOfLife(int[][] board){
        int rows = board.length;
        int cols = board[0].length;
        int[][] copyBoard = copyBoard(board);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int aliveNeighbors = aliveNeighbors(copyBoard,i,j);
                if(copyBoard[i][j] == 1){
                    if(aliveNeighbors == 2 || aliveNeighbors == 3){
                        board[i][j] = 1;
                    }
                    else{
                        board[i][j] = 0;
                    }
                }
                else{
                    if(aliveNeighbors == 3){
                        board[i][j] = 1;
                    }
                    else{
                        board[i][j] = 0;
                    }
                }
            }
        }
        for (int[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] copyBoard(int[][] board){
        int rows = board.length;
        int cols = board[0].length;
        int[][] copyBoard = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                copyBoard[i][j] = board[i][j];
            }
        }
        return copyBoard;
    }

    public static int aliveNeighbors(int[][] board, int i, int j){
        int rows = board.length;
        int cols = board[0].length;
        int[] dirX = {-1, -1, 0, +1, +1, +1, 0, -1};
        int[] dirY = {0, +1, +1, +1, 0, -1, -1, -1};
        int countAlive = 0;
        for(int k = 0; k < dirX.length; k++){
            int neighX = i + dirX[k];
            int neighY = j + dirY[k];
            if(neighX >= 0 && neighX < rows && neighY >= 0 && neighY < cols){
                if(board[neighX][neighY] == 1){
                    countAlive++;
                }
            }
        }
        return countAlive;
    }

    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }
}
