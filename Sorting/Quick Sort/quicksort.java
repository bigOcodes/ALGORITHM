import java.util.*;

public class quicksort{
    static void swap(int[]a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[]a,int s,int e){   //partition(int[]array, int starting_index, int ending_index)
        int x = a[s];
        int i = s;
        for(int j=s+1;j<=e;j++){
            if(a[j]<=x){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i,s);
        return i;
    }

    static void quickSort(int[]a,int s,int e){
        if(s<e){
            int pivot = partition(a,s,e);
            quickSort(a,s,pivot-1);
            quickSort(a,pivot+1,e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        quickSort(array,0,(array.length-1));
        System.out.println("Sorted array: ");
        for(int e:array){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
