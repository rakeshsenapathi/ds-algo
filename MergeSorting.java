import java.util.HashMap;
import java.util.Map;

/**
 * Created by Senapathi on 29-01-2018.
 */
public class MergeSorting {


    public static void main(String args[]) {

        String[] codes = {"c 21213", "f 231421", "e 9312321"};


        HashMap<String, Integer> hashMap = new HashMap<>();


        for (String code : codes) {

            String[] temp = code.split("\\s+");

            hashMap.put(temp[0], (Integer.parseInt(temp[1])));
        }

        for (Map.Entry<String, Integer> hmap : hashMap.entrySet()) {

            System.out.println(hmap.getKey() + hmap.getValue());


        }

    }
}