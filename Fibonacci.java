/**
 * Created by Senapathi on 02-09-2017.
 */
public class Fibonacci {

    private int Fib(int n){

        int f1 = 0;
        int f2 = 1;
        int f=0;

        if(n <=1 ){
            return n;
        }

        else {

            for(int i=2;i<=n;i++){
                f = f1 + f2;
                f1 = f2;
                f2 = f;
            }
            return f;
        }

    }

    public static void main(String args[]){

        Fibonacci obj = new Fibonacci();
        int number = obj.Fib(40);
        System.out.println(number);
    }

}

