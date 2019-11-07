import java.io.Console;

public class NewYearChaos {

    static String minimumBribes(int[] q) {

        int bribeCount = 0;

        for (int index = 0; index < q.length; index ++) {
            if ((q[index] - (index +1)) > 2) {
                System.out.println("Too chaotic");
                return "Too chaotic";
            }
            for (int j = Math.max(0, q[index]-2); j < index; j++) {
                if (q[j] > q[index])
                    bribeCount++;
            }
        }

        System.out.println(bribeCount);
        return String.valueOf(bribeCount);


    }
}
