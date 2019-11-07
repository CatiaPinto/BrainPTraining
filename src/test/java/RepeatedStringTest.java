import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatedStringTest {

    @Test
    public void RepeatStringXTimes () {
        //given
        String inputString = "aba";
        long numberOfRepetition = 10;

        //when
        long result = RepeatedString.repeatedString(inputString, numberOfRepetition);

        //then
        assertEquals(7, result);

    }

    @Test
    public void RepeatStringXTimes2 () {
        //given
        String inputString = "a";
        long numberOfRepetition = 1000000000000L;

        //when
        long result = RepeatedString.repeatedString(inputString, numberOfRepetition);

        //then
        assertEquals(1000000000000L, result);

    }

    @Test
    public void RepeatStringXTimes3 () {
        //given
        String inputString = "aab";
        long numberOfRepetition = 882787;

        //when
        long result = RepeatedString.repeatedString(inputString, numberOfRepetition);

        //then
        assertEquals(588525, result);

    }

    @Test
    public void RepeatStringXTimes4 () {
        //given
        String inputString = "ceebbcb";
        long numberOfRepetition = 817723;

        //when
        long result = RepeatedString.repeatedString(inputString, numberOfRepetition);

        //then
        assertEquals(0, result);

    }

    @Test
    public void RepeatStringXTimes5 () {
        //given
        String inputString = "gfcaaaecbg";
        long numberOfRepetition = 547602;

        //when
        long result = RepeatedString.repeatedString(inputString, numberOfRepetition);

        //then
        assertEquals(164280, result);

    }

}