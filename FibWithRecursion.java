/**
 * Created by Senapathi on 02-09-2017.
 */
public class FibWithRecursion {

    private int Fib(int n){

        if(n <=1 ){

            return n;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }

    public static void main(String args[]){
        FibWithRecursion obj = new FibWithRecursion();
        System.out.println(obj.Fib(10));
    }
}
