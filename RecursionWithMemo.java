/**
 * Created by Senapathi on 02-09-2017.
 */
public class RecursionWithMemo {

    public static int arr[] = new int[51];
    private int Fib(int n){

        if(n<=1){
            return n;
        }
        if(arr[n]!= -1){

            return arr[n];

        }

        arr[n]= Fib(n-1)+Fib(n-2);
        return arr[n];

    }


    public static void main(String args[]){

        for(int i=0;i<51;i++){
            arr[i] = -1;
        }
        RecursionWithMemo obj = new RecursionWithMemo();
        System.out.print(obj.Fib(40));
    }
}
