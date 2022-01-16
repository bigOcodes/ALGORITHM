public class insertionsort {
    static void insertionSort(int[]a){
        int n = a.length;
        for(int i=1;i<n;i++){
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {4,3,2,10,12,1,5,6};
        insertionSort(arr);
        System.out.println("sorted array: ");
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
