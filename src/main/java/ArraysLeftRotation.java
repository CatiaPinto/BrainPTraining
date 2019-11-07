import java.util.HashMap;

public class ArraysLeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int[] resultArray = new int[a.length];

        //if numberOfRotations > length of array
        if (d > a.length) {
            d = d % a.length;
        }

        //move the right n-k elements to the left side. a=source, beginning on d position
        //new array, beginning on 0 + length of the array minus the numbers already in the array
        System.arraycopy(a, d, resultArray, 0, a.length-d);
        //move the left k elements to the right side
        System.arraycopy(a, 0, resultArray,  a.length-d, d);

        return resultArray;
    }
}
