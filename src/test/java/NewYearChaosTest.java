import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class NewYearChaosTest {

    @Test
    public void minimumBribes() {
        //given
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        int[] queueFinalState = {2, 1, 5, 3, 4};

        System.setOut(new PrintStream(outContent));

        //when
        String result = NewYearChaos.minimumBribes(queueFinalState);

        //then
        assertEquals(result, "3");
    }

    @Test
    public void minimumBribes2() {
        //given
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        int[] queueFinalState = {2, 5, 1, 3, 4};

        System.setOut(new PrintStream(outContent));

        //when
        String result = NewYearChaos.minimumBribes(queueFinalState);

        //then
        assertEquals("Too chaotic", result);
    }

    @Test
    public void minimumBribes3() {
        //given
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        int[] queueFinalState = {5, 1, 2, 3, 7, 8, 6, 4};

        System.setOut(new PrintStream(outContent));

        //when
        String result = NewYearChaos.minimumBribes(queueFinalState);

        //then
        assertEquals("Too chaotic", result);
    }

    @Test
    public void minimumBribes4() {
        //given
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        int[] queueFinalState = {1, 2, 5, 3, 7, 8, 6, 4};

        System.setOut(new PrintStream(outContent));

        //when
        String result = NewYearChaos.minimumBribes(queueFinalState);

        //then
        assertEquals("7",result);
    }

    @Test
    public void minimumBribes5() {
        //given
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        int[] queueFinalState = {1, 2, 5, 3, 4, 7, 8, 6};

        System.setOut(new PrintStream(outContent));

        //when
        String result = NewYearChaos.minimumBribes(queueFinalState);

        //then
//        assertEquals(4, outContent.toString());
         assertEquals("4", result);
    }
}