/**
 * Created by Senapathi on 29-06-2021.
 */
public class ArrayProblem1 {
    // https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
    public static void main(String args[]){
        int x = 23;
        int k = 5;
        int[] arr = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25 };
        boolean result = false;
        for(int i = 0; i < arr.length; i+=k){
            boolean exists = false;
            for(int j = i; j < i + k; j++){
                if(j >= arr.length){
                    break;
                }
                else if(arr[j] == x){
                    exists = true;
                }
            }
            result = exists;
        }
        System.out.println(result);
    }
}
