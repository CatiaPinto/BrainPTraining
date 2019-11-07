import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SockMerchantTest {

    @Test
    public void shouldReturnRightNumberOfSocks() {

        //given
        int numberOfSocks = 9;
        int [] colorsDescribed = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //when
        int numberPairs = SockMerchant.sockMerchant(numberOfSocks, colorsDescribed);

        //then
        assertEquals(3, numberPairs);

    }
}