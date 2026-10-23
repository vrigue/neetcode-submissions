class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {
            HashSet<Character> vals = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char cur = board[i][j];
                if (cur != '.') {
                    if (!vals.contains(cur)) {
                        vals.add(cur);
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            HashSet<Character> vals = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char cur = board[j][i];
                if (cur != '.') {
                    if (!vals.contains(cur)) {
                        vals.add(cur);
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int s = 0; s < 9; s++) {
            HashSet<Character> vals = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (s / 3) * 3 + i;
                    int c = (s % 3) * 3 + j;
                    char cur = board[r][c];
                    if (cur != '.') {
                    if (!vals.contains(cur)) {
                        vals.add(cur);
                    } else {
                        return false;
                    }
                }
                }
            }
        }

        return true;
    }
}
