class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking rows
        for(int i = 0; i < board.length ; i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j = 0 ; j < board[i].length ; j++){  //for(char c : board[i])
                if(board[i][j]== '.') continue;
                if(rowSet.contains(board[i][j])){
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }
        
        //checking columns
          for(int i = 0; i < board.length ; i++){
            HashSet<Character> columnSet = new HashSet<>();
            for(int j = 0 ; j < board[0].length ; j++){  
                if(board[j][i]== '.') continue;
                if(columnSet.contains(board[j][i])){
                    return false;
                }
                columnSet.add(board[j][i]);
            }
        }

        for(int row =0; row < 9 ; row +=3){

            for(int col = 0; col< 9; col += 6){
  //checking boxes
              HashSet<Character> boxSet = new HashSet<>();
       for(int i = row; i < row+3 ; i++){

            for(int j = col ; j < col+3 ; j++){ 
                if(board[i][j]== '.') continue;
                if(boxSet.contains(board[i][j])){
                    return false;
                }
                boxSet.add(board[i][j]);
            }
        }
            }
        }
      
        return true;
    }
}
