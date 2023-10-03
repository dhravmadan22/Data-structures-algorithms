class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> finalResult = new ArrayList<>(m*n);
        int startColumn = 0;
        int endColumn = n-1;
        int startRow = 0;
        int endRow = m - 1;


        while(startColumn <= endColumn && startRow <= endRow){
            int i = startColumn;
            while(i <= endColumn){
                finalResult.add(matrix[startRow][i]);
                i++;
            }
            startRow++;
            int a = startRow;
            while(a <= endRow){
                finalResult.add(matrix[a][endColumn]);
                a++;
            }
            endColumn--;

            if (startRow <= endRow) {
            int j = endColumn;

            while(j >= startColumn){
                finalResult.add(matrix[endRow][j]);
                j--;
            }
            endRow--;
            }


            if (startColumn <= endColumn) {
            int b = endRow;

            while(b >= startRow){
                finalResult.add(matrix[b][startColumn]);
                b--;
            }
            startColumn++;
            }

            // System.out.println("Start Column:"+startColumn+" End Column:"+endColumn+" Start Row:"+startRow+" End Row:"+endRow);

        }
        return finalResult;
    }
}

// 4 5
// 7 8