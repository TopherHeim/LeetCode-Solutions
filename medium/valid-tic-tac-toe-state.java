class Solution {
    public boolean validTicTacToe(String[] board) {
        int countx = 0;
        int counto = 0;

        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                char c = board[row].charAt(column);
                if(c == 'X'){
                    countx++;
                }
                else if(c == 'O'){
                    counto++;
                }
            }
        }

        if(counto > countx) return false;
        if(countx > counto + 1) return false;

        boolean xwin = false;
        boolean owin = false;
        if(
        (board[0].equals("XXX")) || 
        (board[1].equals("XXX")) || 
        (board[0].equals("XXX")) || 
        (board[0].charAt(1) == 'X' && 
        board[1].charAt(1) == 'X' && 
        board[2].charAt(1) == 'X') || 
        (board[0].charAt(2) == 'X' && 
        board[1].charAt(2) == 'X' && 
        board[2].charAt(2) == 'X') || 
        (board[0].charAt(0) == 'X' && 
        board[1].charAt(0) == 'X' && 
        board[2].charAt(0) == 'X') || 
        (board[0].charAt(0) == 'X' && 
        board[1].charAt(1) == 'X' && 
        board[2].charAt(2) == 'X') ||
        (board[0].charAt(2) == 'X' &&
        board[1].charAt(1) == 'X' &&
        board[2].charAt(0) == 'X')){
            xwin = true;
        }
        if(
        (board[0].equals("OOO")) || 
        (board[1].equals("OOO")) || 
        (board[0].equals("OOO")) || 
        (board[0].charAt(1) == 'O' && 
        board[1].charAt(1) == 'O' && 
        board[2].charAt(1) == 'O') || 
        (board[0].charAt(2) == 'O' && 
        board[1].charAt(2) == 'O' && 
        board[2].charAt(2) == 'O') || 
        (board[0].charAt(0) == 'O' && 
        board[1].charAt(0) == 'O' && 
        board[2].charAt(0) == 'O') || 
        (board[0].charAt(0) == 'O' && 
        board[1].charAt(1) == 'O' && 
        board[2].charAt(2) == 'O') ||
        (board[0].charAt(2) == 'O' &&
        board[1].charAt(1) == 'O' &&
        board[2].charAt(0) == 'O')){
            owin = true;
        }

    if(xwin && owin){
        return false;
    }
    if(xwin && countx != counto + 1){
        return false;
    }
    if(owin && countx != counto){
        return false;
    }

    return true;  

    }
}