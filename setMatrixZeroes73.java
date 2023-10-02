class Solution {
    public void setZeroes(int[][] matrix) {
        // TC O(N*M) SC O(1)

        // First rows and columns will act as rows and colums array
        int col0 = 1;
        int numsRows = matrix.length;
        int numsColumns = matrix[0].length;

        for(int i =0;i< numsRows; i++){
            for(int j=0; j<numsColumns;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j!=0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i =1;i< numsRows; i++){
            for(int j=1; j<numsColumns;j++){
                if(j == 0){
                    if(matrix[i][0] == 0 || col0 == 0) matrix[i][j] = 0;
                }else{
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j =0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int j =0;j<matrix.length;j++){
                matrix[j][0] = 0;
            }
        }




        
        
        // best Tc but Sc is O(N+M)

        // List<Integer> rows = new ArrayList<>();
        // List<Integer> columns = new ArrayList<>();

        // int numsRows = matrix.length;
        // int numsColumns = matrix[0].length;

        // for(int i =0;i< numsRows; i++){
        //     for(int j=0; j<numsColumns;j++){

        //         if(matrix[i][j] == 0){
        //             rows.add(i);
        //             columns.add(j);
        //         }

        //     }
        // }
        // for(int i =0;i< numsRows; i++){
        //     for(int j=0; j<numsColumns;j++){

        //         if(matrix[i][j] != 0){
        //             if(rows.contains(i) || columns.contains(j)){
        //             matrix[i][j] = 0;
        //         }
        //         }

        //     }
        // }
    }
}