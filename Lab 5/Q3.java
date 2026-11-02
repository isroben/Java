public class Q3{
    public static void main(String[] args){
        int[] arr = {10, 2, 3, 14, 5, 26, 7};

        for(int i=0; i<7; ++i){
            int curr = arr[i]; // storing current element
            int prev = i-1; // tracking previous index

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

        System.out.println("Sorted Array: \n");
        for(int i: arr){
            System.out.println(i);
        }
    }
}