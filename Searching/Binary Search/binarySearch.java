//Binary search
import java.util.Scanner;

class binarySearchTree{
    static int binarySearch(int[] arr, int start, int end, int key){
        if(end >= start){
            int mid = (start + end)/2;
            if(arr[mid] == key)
                return mid;
            if(key < arr[mid]){
                return binarySearch(arr, start, mid-1, key);
            }
            return binarySearch(arr, mid+1, end, key);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2,5,8,12,16,23,38,56,72,91};
        int length = nums.length;
        int S_key = 23;
        int result = binarySearch(nums, 0, length-1, S_key);

        if(result == -1){
            System.out.println("key is not present in array");
        }else{
            System.out.println("element found at loaction: "+result);
        }
    }
}
