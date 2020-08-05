package kata.kyu_6;

import java.util.ArrayList;
import java.util.List;

public class RemovingEachSecondPersonFromACircle {

    public static List<String> crossingOut(List<String> list) {
        List<String>result = new ArrayList<String>();
        int count = 0;
        while (list.size()>1) {

            if (count%2!=0){
                result.add(list.get(0));
                list.remove(0);
                count++;
            }
            if (count%2==0) {
                list.add(list.get(0));
                list.remove(0);
                count++;}
        }
        return result;
    }
}
