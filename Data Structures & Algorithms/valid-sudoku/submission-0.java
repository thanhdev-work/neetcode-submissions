class Solution {
    public boolean isValidSudoku(char[][] board) {
        // boxIdx = (r / 3) * 3 + (c / 3); <- Box indx formula
        
        // 3 hash set to check duplicate
        Set<Character>[] rows  = new HashSet[9];
        Set<Character>[] cols  = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            rows[i]  = new HashSet<>();
            cols[i]  = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c ++){
                if (board[r][c] == '.') continue;
                
                int boxIdx = (r / 3) * 3 + (c / 3);
                if(
                    rows[r].contains(board[r][c]) ||
                    cols[c].contains(board[r][c]) ||
                    boxes[boxIdx].contains(board[r][c])
                ) return false;

                rows[r].add(board[r][c]);
                cols[c].add(board[r][c]);
                boxes[boxIdx].add(board[r][c]);
            }
        }
        return true;
    }
}
