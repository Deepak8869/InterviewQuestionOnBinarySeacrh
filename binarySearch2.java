public class binarySearch2 {
    public static void main(String[] args) {
        int [] arr = {25,23,21,19,12,8,6};
        int key = 23;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                System.out.println(arr[mid] + " Found");
                break;
            }
            else if(arr[mid] < key){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
    }
}
