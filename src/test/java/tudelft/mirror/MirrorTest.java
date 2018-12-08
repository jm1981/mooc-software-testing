package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private static Mirror m;

    @BeforeAll
    public static void init() {
        m  = new Mirror();
    }

    @Test
    public void testOddCharsEvenMirror() {
        Assertions.assertEquals("ab", m.mirrorEnds("abXYZba"));
    }

    @Test
    public void testSingleChar() {
        Assertions.assertEquals("a", m.mirrorEnds("a"));
    }
    @Test
    public void testOddCharsFullMirror() {
        Assertions.assertEquals("aba", m.mirrorEnds("aba"));
    }
    @Test
    public void testOddCharsOddMirror() {
        Assertions.assertEquals("a", m.mirrorEnds("abcda"));
    }
    @Test
    public void testEvenCharsEvenMirror() {
        Assertions.assertEquals("a", m.mirrorEnds("abccda"));
    }

    @Test
    public void test() {
        Assertions.assertEquals("abccba", m.mirrorEnds("abccba"));
    }
}
