package kata.kyu_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CircularList<T> {

    List<T> elementsList;
    int currentIndex = -1;

    public CircularList(final T... elements) {
        if (elements == null || elements.length == 0) {
            throw new RuntimeException();
        }
        elementsList = Arrays.stream(elements).collect(Collectors.toList());
    }

    T next() {
       currentIndex = currentIndex + 1 >= elementsList.size() ? 0 : currentIndex + 1;
        return elementsList.get(currentIndex);
    }

    T prev() {
        currentIndex = currentIndex - 1 < 0 ? elementsList.size() - 1 : currentIndex - 1;
        return elementsList.get(currentIndex);
    }
}
