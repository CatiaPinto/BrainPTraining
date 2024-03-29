import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RansomNoteTest {

    @Test
    public void checkMagazine() {
        //given

        String magazine = "give me one grand today night";
        String note = "give one grand today";
        String expectedResult = "Yes";

        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        //when
        String actualResult = RansomNote.checkMagazine(magazineArray, noteArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkMagazine1() {
        //given
        String magazine = "two times three is not four";
        String note = "two times two is four";
        String expectedResult = "No";

        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        //when
        String actualResult = RansomNote.checkMagazine(magazineArray, noteArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkMagazine2() {
        //given

        String magazine = "ive got a lovely bunch of coconuts";
        String note = "ive got some coconuts";
        String expectedResult = "No";

        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        //when
        String actualResult = RansomNote.checkMagazine(magazineArray, noteArray);

        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkMagazine3() {
        //given

        String magazine = "wi z ne we ebixk yvrd qrd ojckw q xe e bcco xb ieqym dwuu w dnapw achkt xqdhs nstms zmqu " +
                "csqxi rim tvic arq fvjqx x su ty zl zmah y tv rkjq hpvpx ujj f i u fl iv n mnrvx tho diz k tidi gr " +
                "ptkq z tho su diz yvrd dwuu dnapw xb arq xb mnrvx xe bcco qrd y ptkq rim fvjqx bcco q q wi i tidi gr " +
                "mnrvx hpvpx tv f y mnrvx we fvjqx tv f wi ptkq ujj rim ebixk tho ptkq rkjq yvrd dwuu zl ujj zl qrd e ieqym";
        String note = "dwuu tvic y dnapw ujj tidi nstms x xe achkt x su zmqu iv zmqu xb ojckw we fvjqx tvic tv ne rkjq " +
                "diz tvic we rkjq nstms zmah ieqym zmah fl xb wi tho x z ty u i gr ptkq q su tho rim tv iv iv yvrd xe " +
                "qrd y dnapw q zmah arq we ieqym su zl q xb arq rkjq q e xb zl ty fvjqx ptkq ieqym qrd y wi wi nstms " +
                "diz dnapw zmah q ebixk su e xb q i mnrvx wi x x tidi w ojckw bcco e tv rkjq tho";
        String expectedResult = "No";

        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        //when
        String actualResult = RansomNote.checkMagazine(magazineArray, noteArray);

        //then
        assertEquals(expectedResult, actualResult);
    }
}