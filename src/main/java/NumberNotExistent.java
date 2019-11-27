import java.util.HashSet;
import java.util.Set;


//given an array A of N integers, returns the smallest positive integer
// (greater than 0) that does not occur in A.
public class NumberNotExistent {
    static public int solution(int[] A) {

        int n = A.length;
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return n;
    }
}
