import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SherlockAndAnagramsTest {

    @Test
    public void sherlockAndAnagrams() {
        //given
        String anagram = "abba";

        //when
        int actualResult = SherlockAndAnagrams.sherlockAndAnagrams(anagram);

        //then
        assertEquals(4, actualResult);
    }

    @Test
    public void sherlockAndAnagrams1() {
        //given
        String anagram = "abcd";

        //when
        int actualResult = SherlockAndAnagrams.sherlockAndAnagrams(anagram);

        //then
        assertEquals(0, actualResult);
    }

    @Test
    public void sherlockAndAnagrams2() {
        //given
        String anagram = "ifailuhkqq";

        //when
        int actualResult = SherlockAndAnagrams.sherlockAndAnagrams(anagram);

        //then
        assertEquals(3, actualResult);
    }

    @Test
    public void sherlockAndAnagrams3() {
        //given
        String anagram = "kkkk";

        //when
        int actualResult = SherlockAndAnagrams.sherlockAndAnagrams(anagram);

        //then
        assertEquals(10, actualResult);
    }

    @Test
    public void sherlockAndAnagrams4() {
        //given
        String anagram = "cdcd";

        //when
        int actualResult = SherlockAndAnagrams.sherlockAndAnagrams(anagram);

        //then
        assertEquals(5, actualResult);
    }
}