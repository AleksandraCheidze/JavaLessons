public class Chess {
    public static void main(String[] args) {
        //Заполнение полей шахматной доски. Двумерный массив.

        //1 - chernoe pole
        // 0 - beloe pole
        int [][]chessDesk = new int [8][8];
        //chessDesk [i][j] - eto elementi dvumernogo massiva
        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[0].length; j++) {
                chessDesk[i][j] = (j+i) % 2;
                System.out.print(chessDesk[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
