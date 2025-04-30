public class question5 {
    public static void main(String[] args) {
     
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };


        for (int i = 0; i < jaggedArray.length; i++) {
            int rowSum = 0;
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
                rowSum += jaggedArray[i][j];
            }
            System.out.println(" | Sum of Row " + (i + 1) + ": " + rowSum);
        }
    }
}
