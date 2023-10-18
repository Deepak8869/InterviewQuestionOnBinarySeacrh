public class binarySearch1 {
    public static void main(String[] args) {
        int [] arr = { 1,2 ,3,4,5,10,14,16,};

        int key = 14;
        int start = arr[0]; 
        int end = arr.length -1;
        
        while(start <= end){
            int mid = (start + end ) /2;
            if(arr[mid] == key){
                System.out.print(arr[mid]);
                break;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
    }
}
