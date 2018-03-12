import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class BinarySearch {

    public static <T extends Comparable<T>> boolean binarySearch(List<T> a, T x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            T guess = a.get(mid);
            if (guess.compareTo(x) == 0) {
                return true;
            } else if (guess.compareTo(x) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);

        System.out.println(binarySearch(a, 6));
    }
}
