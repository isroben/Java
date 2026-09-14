public class sortArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15, 2, 30};

        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

        for(int val: arr){
            System.out.println(val +" ");
        }
    }
    
}
