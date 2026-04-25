package kata.kyu_7;

import java.util.List;

public class StalinSort {

    public static void main(String[] args) {
       stalinSort(List.of(3, 1, 4, 1, 5, 9, 2));
    }

    public static void stalinSort(List<Integer> arr){
        if (arr != null && arr.size() > 1){
            for (int i = 1; i < arr.size();) {
                if (arr.get(i - 1) > arr.get(i)) {
                    arr.remove(i);
                } else {
                    i++;
                }
            }
        }
    }
}
