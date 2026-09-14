public class jaggedArray {
    public static void main(String[] args) {
        // Creating a jagged array
        int[][] arr = new int[3][];

        // Initializing each row with different sizes
        arr[0] = new int[] {1, 2};
        arr[1] = new int[] {3, 4, 5};
        arr[2] = new int[] {6, 7, 8, 9};

        for(int i=0; i<arr.length; i++){
            int rowSum = 0;
            for(int j=0; j<arr[0].length; j++){
                rowSum += arr[i][j];
            }
            System.out.println("Sum of "+ i + " row is : "+ rowSum);
        }
    }
}
