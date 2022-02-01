package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksForIfAndSwitchSpecialTest {

    @Test
    public void test_getSeason_String() {
        assertSeasonEquals("tél", "december", "január", "február");
        assertSeasonEquals("tavasz", "március", "április", "május");
        assertSeasonEquals("nyár", "június", "július", "augusztus");
        assertSeasonEquals("ősz", "szeptember", "október", "november");
        assertSeasonEquals("ismeretlen", "haha", "mókamiki");
    }

    @Test
    public void test_getSeason_int() {
        assertSeasonEquals("tél", 12, 1, 2);
        assertSeasonEquals("tavasz", 3, 4, 5);
        assertSeasonEquals("nyár", 6, 7, 8);
        assertSeasonEquals("ősz", 9, 10, 11);
        assertSeasonEquals("ismeretlen", 0, 13, 42, 66);
    }

    /**
     * String... months - ez az úgynevezett "varargs".
     * <br>
     * Röviden annyit róla, hogy így 0 vagy akárhány paramétert át tudsz adni a metódusnak.
     * Ezek a paraméterek a metódusban tömbként viselkednek - úgymond.
     * <br>
     * A fenti tesztek meghívásánál láthatod, hogy valahol csak két paramétert adtam át,
     * valahol hármat, valahol viszont négyet.
     */
    private void assertSeasonEquals(String season, String... months) {
        for (String month : months) {
            String result = TasksForIfAndSwitch.getSeason(month);
            assertEquals(season, result);
        }
    }

    private void assertSeasonEquals(String season, int... months) {
        for (int month : months) {
            String result = TasksForIfAndSwitch.getSeason(month);
            assertEquals(season, result);
        }
    }

}
