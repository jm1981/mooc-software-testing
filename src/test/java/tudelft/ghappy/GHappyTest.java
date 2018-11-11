package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        gHappy = new GHappy();
    }

    @Test
    public void testNone() {
        Assertions.assertEquals(true, gHappy.gHappy("abc"));
    }

    @Test
    public void testDoubleG() {
        Assertions.assertEquals(true, gHappy.gHappy("gg"));
    }

    @Test
    public void testDoubleGEnd() {
        Assertions.assertEquals(true, gHappy.gHappy("agg"));
    }

    @Test
    public void testDoubleGBegin() {
        Assertions.assertEquals(true, gHappy.gHappy("gga"));
    }

    @Test
    public void testDoubleGMiddle() {
        Assertions.assertEquals(true, gHappy.gHappy("abgga"));
    }

    @Test
    public void testDoubleBeginAndSingleMiddle() {
        Assertions.assertEquals(false, gHappy.gHappy("ggaga"));
    }

    @Test
    public void testSingleMiddleAndDoubleMiddle() {
        Assertions.assertEquals(false, gHappy.gHappy("agagga"));
    }

    @Test
    public void testSingleBeginAndDoubleMiddle() {
        Assertions.assertEquals(false, gHappy.gHappy("gagga"));
    }

    @Test
    public void testFourGs() {
        Assertions.assertEquals(true, gHappy.gHappy("gggg"));
    }
}
