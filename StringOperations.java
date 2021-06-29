import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Senapathi on 27-05-2018.
 */
public class StringOperations {

    public static void main(String args[]){

        StringBuilder builder = new StringBuilder("");
        builder.append("SuperManBatCat");
        String s = "1-abc";
        String[] s1 = s.split("-");
        System.out.println(s.charAt(0));
        Stack<String> stack = new Stack<>();
        int k = 3;
        builder.append("FIle");
        System.out.println(builder);
        System.out.println(builder.substring((builder.length() - k), builder.length()));
        System.out.println(builder.delete((builder.length() - k), builder.length()));



    }


}
