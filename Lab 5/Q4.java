public class Q4{
    public static void main(String[] args){

        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] C = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for(int i=0; i<3; ++i){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    C[i][j] += A[i][k] * B[k][j]; 
                }
            }
        }

        for(int p = 0; p<3; p++){
            for(int q=0; q<3; q++){
                System.out.println(C[p][q]);
            }
            System.out.println();
        }


    }
}