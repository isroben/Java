
public class matMul {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] C = new int[3][3];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[0].length; j++){
                for(int k=0; k<A.length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[0].length; j++){
                System.err.println(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
