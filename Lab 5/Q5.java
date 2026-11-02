public class Q5{
    public static void main(String[] args){
        int[][] A = {{1,2,3},
                    {5, 7},
                    {9, 0}};

        for(int i=0; i<A.length; ++i){
            int sum = 0;
            for(int j=0; j<A[i].length; ++j){
                sum += A[i][j];
            }
            System.out.println("Sum of " + i + " th row: "+ sum);
        }
    }
}