/**
 * Created by Senapathi on 02-12-2018.
 */
public class QuickSort {

    public static int arr[] = {15,23,4,19,20,5,7,11};

    public static void main(String args[]){

        System.out.println(arr.length - 1);

        doQuickSort(arr, 0, arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    private static void doQuickSort(int[] arr, int start , int end) {

        int pivot_index;

        if( start < end){

            pivot_index = doPartition(arr, start, end);

            System.out.println("Pivoted Index : " + pivot_index);

            doQuickSort(arr, start, pivot_index - 1);

            doQuickSort(arr, pivot_index + 1, end);
        }

    }

    private static int doPartition(int[] arr, int start, int end) {

        int pivot = arr[start];

        int l = start;
        int r = end;

        while(l < r){
            while(arr[l] <= pivot){
                l++;
            }
            while(arr[r] > pivot){
                r--;
            }
            if(l < r) {
                swap(arr, l, r);
            }
        }
        swap(arr, start, r);
        return r;

    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
