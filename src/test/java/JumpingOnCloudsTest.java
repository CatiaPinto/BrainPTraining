import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpingOnCloudsTest {

    @Test
    public void jumpingOnClouds() {
        //given
        int[] numberOfCloud = {0, 0, 1, 0, 0, 1, 0};

        //when
        int numberOfMoves = JumpingOnClouds.jumpingOnClouds(numberOfCloud);

        //then
        assertEquals(4, numberOfMoves);
    }

    @Test
    public void jumpingOnClouds1() {
        //given
        int[] numberOfCloud = {0, 0, 0, 0, 1, 0};

        //when
        int numberOfMoves = JumpingOnClouds.jumpingOnClouds(numberOfCloud);

        //then
        assertEquals(3, numberOfMoves);
    }

    @Test
    public void jumpingOnClouds2() {
        //given
        int[] numberOfCloud = {0, 1, 0, 0, 0, 1, 0};

        //when
        int numberOfMoves = JumpingOnClouds.jumpingOnClouds(numberOfCloud);

        //then
        assertEquals(3, numberOfMoves);
    }

    @Test
    public void jumpingOnClouds3() {
        //given
        int[] numberOfCloud = {0, 0, 0, 1, 0, 0};

        //when
        int numberOfMoves = JumpingOnClouds.jumpingOnClouds(numberOfCloud);

        //then
        assertEquals(3, numberOfMoves);
    }
}