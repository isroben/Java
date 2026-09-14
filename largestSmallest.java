public class largestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15, 2, 30};

        int largest = arr[0];
        int smallest = arr[0];

        for(int val: arr){
            if(val > largest){
                largest = val;
            }
            if(val < smallest){
                smallest = val;
            }
        }

        System.out.println("Largest element of Array: " + largest);
        System.out.println("Smallest element of Array: " + smallest);
    }
}
