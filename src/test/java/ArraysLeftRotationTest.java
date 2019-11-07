import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArraysLeftRotationTest {

    @Test
    public void test(){
        //given
        int numberOfRotations = 4;
        int [] arrayToRotate = {1,2,3,4,5};
        int [] actualResult = {5,1,2,3,4};

        //when
        int[] expectedArrayAfterRotation = ArraysLeftRotation.rotLeft(arrayToRotate, numberOfRotations);

        //then
        assertArrayEquals(actualResult, expectedArrayAfterRotation);
    }

    @Test
    public void test2(){
        //given
        int numberOfRotations = 10;
        int [] arrayToRotate = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        int [] actualResult = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};

        //when
        int[] expectedArrayAfterRotation = ArraysLeftRotation.rotLeft(arrayToRotate, numberOfRotations);

        //then
        assertArrayEquals(actualResult, expectedArrayAfterRotation);
    }

    @Test
    public void test3(){
        //given
        int numberOfRotations = 13;
        int [] arrayToRotate = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int [] actualResult = {87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60};

        //when
        int[] expectedArrayAfterRotation = ArraysLeftRotation.rotLeft(arrayToRotate, numberOfRotations);

        //then
        assertArrayEquals(actualResult, expectedArrayAfterRotation);
    }

}