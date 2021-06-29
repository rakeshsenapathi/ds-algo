import java.util.Arrays;

/**
 * Created by Senapathi on 26-01-2018.
 * TimeComplexity : O(n*n)
 */
public class InsertionSorting {

    public void insertionSort(int[] array, int size) {


        if (size == 1) {

            return;

        }

        // Recursively go until reaching the final element
        else insertionSort(array, size - 1);


        // Here size - 1, size -2 mean ultimate and penultimate elements in the array
        while (size - 2 >= 0 && array[size - 1] < array[size - 2]) {

            int temp = array[size - 1];

            array[size - 1] = array[size - 2];

            array[size - 2] = temp;

            size--;


        }


    }

    public static void main(String args[]) {

        int[] arr = new int[]{5, 3, 1, 6, 2};

        InsertionSorting obj = new InsertionSorting();

        obj.insertionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));


    }


}
