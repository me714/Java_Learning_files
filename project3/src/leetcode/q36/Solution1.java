package leetcode.q36;
//½«Êý×Ö»»Î»ÖÃ
public class Solution1 {
    public static boolean isVaildSudoku(char[][] board){
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] !='.'){
                    int num = board[i][j]- '1';
                    int boxes_dex = (i/3)*3 +j/3;
                    if (rows[i][num]==1){
                        return false;

                    }else {
                        rows[i][num] = 1;
                    }
                    if (columns[j][num]==1){
                        return false;
                    }else {
                        columns[j][num] = 1;
                    }
                    if (boxes[boxes_dex][num]==1){
                        return false;
                    }else {
                        boxes[boxes_dex][num] = 1;
                    }
                }
            }

        }
        return true;
    }
}
