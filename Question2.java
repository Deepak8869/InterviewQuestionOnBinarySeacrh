package questionsOnBinarySearch;

public class Question2 {
    public static void main(String[] args) {
        int [] arr = {1,4,6,8,10,14};

        int start = 0;
        int end = arr.length-1;

        int mid;
        int target =11;

        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }

            else if(arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid] > target){
                System.out.println(mid);
                end = mid -1;
            }
        }
    }
}
