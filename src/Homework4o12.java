public class Homework4o12 {
    public static void main(String[] args) {
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }
        for (String[] strings : chessBoard) {
            for (int j = 0; j < chessBoard[0].length; j++)
                System.out.print(" " + strings[j] + " ");
            System.out.println();
        }
    }
}
