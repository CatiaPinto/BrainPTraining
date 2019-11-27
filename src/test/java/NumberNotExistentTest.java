import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberNotExistentTest {

    @Test
    public void solution() {
        //given
       int[] numbers = {1, 3, 6, 4, 1, 2};

        //when
        int actualResult = NumberNotExistent.solution(numbers);

        //then
        assertEquals(5, actualResult);


    }

    @Test
    public void solution2() {
        //given
        int[] numbers = {1, 2, 3};

        //when
        int actualResult = NumberNotExistent.solution(numbers);

        //then
        assertEquals(4, actualResult);


    }

    @Test
    public void solution3() {
        //given
        int[] numbers = {-1, -3};

        //when
        int actualResult = NumberNotExistent.solution(numbers);

        //then
        assertEquals(1, actualResult);


    }
}

