public class ArrangeCoins {
    public static int arrangeCoins(int n) {
        int row = 1;
        while(n >= row){
            n -= row;
            row++;
        }
        return row - 1;
    }

    public static void main(String[] args){
        int n = 14;
        int rows = arrangeCoins(n);
        System.out.println(rows);
    }
}
