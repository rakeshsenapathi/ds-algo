/**
 * Created by Senapathi on 03-09-2017.
 */
public class ModularExp {


    private int Mod(int x, int n, int m){

        if(n==0){
            return 1;
        }

        else if(n%2 == 0){
            int y = Mod(x,n/2,m);
            return (y*y)%m;
        }
        else {
            return (x%m)*Mod(x,n-1,m)%m;
        }
    }

    public static void main(String args[]){
        ModularExp obj = new ModularExp();
        System.out.print(obj.Mod(5,2,7));
    }
}
