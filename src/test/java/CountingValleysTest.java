import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

    @Test
    public void countingValleys() {
        //given
        int numberOfSteps = 8;
        String pathDescription = "UDDDUDUU";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(1, numberOfValleys);
    }

    @Test
    public void countingTwoValleys2() {
        //given
        int numberOfSteps = 10;
        String pathDescription = "UDDDUDUUDU";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(2, numberOfValleys);
    }

    @Test
    public void countingTwoValleys3() {
        //given
        int numberOfSteps = 12;
        String pathDescription = "DDUUDDUDUUUD";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(2, numberOfValleys);
    }

    @Test
    public void countingTwoValleys4() {
        //given
        int numberOfSteps = 2;
        String pathDescription = "DU";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(1, numberOfValleys);
    }

    @Test
    public void countingTwoValleys5() {
        //given
        int numberOfSteps = 3;
        String pathDescription = "DDU";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(0, numberOfValleys);
    }

    @Test
    public void countingTwoValleys6() {
        //given
        int numberOfSteps = 20;
        String pathDescription = "DDUUDDUUDDUUDDUUDDUU";

        //when
        int numberOfValleys = CountingValleys.countingValleys(numberOfSteps, pathDescription);
        //then

        Assert.assertEquals(5, numberOfValleys);
    }
}