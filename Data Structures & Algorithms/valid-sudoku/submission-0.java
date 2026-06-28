class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row= new HashSet[9];
        Set<Character>[] column= new HashSet[9];
        Set<Character>[] square= new HashSet[9];

        for(int i=0; i<9 ; i++){
            row[i]= new HashSet<>();
            column[i]= new HashSet<>();
            square[i]= new HashSet<>();
        }
        
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char val= board[r][c];
                if(val == '.'){
                    continue;
                }

                if(row[r].contains(val)){
                    return false;
                }

                row[r].add(val);


                if(column[c].contains(val)){
                    return false;
                }

                column[c].add(val);

                int boxIndex= (r/3)*3 + (c/3);

                if(square[boxIndex].contains(val)){
                    return false;
                }

                square[boxIndex].add(val);
            }
        }

        return true;
    }
}
