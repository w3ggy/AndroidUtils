import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {
    public interface IPredicate<T> {
        boolean apply(T type);
    }

    public static <T> List<T> filter(List<T> collection, IPredicate<T> predicate) {
        List<T> result = new ArrayList<T>();
        for (T element : collection) {
            if (predicate.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> List<T> sort(List<T> collection, Comparator<T> comparator) {
        Collections.sort(collection, comparator);
        return collection;
    }

    public static <T> List<T> copy(List<T> collection) {
        List<T> result = new ArrayList<T>();
        for (T element : collection) {
            result.add(element);
        }
        return result;
    }


    public static int compareLong(long x, long y) {
        return (x > y) ? -1 : ((x == y) ? 0 : 1);
    }

    public static int compareInteger(int x, int y) {
        return (x > y) ? -1 : ((x == y) ? 0 : 1);
    }
}
