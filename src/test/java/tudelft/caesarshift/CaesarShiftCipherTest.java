package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void initialize() {
        caesarShiftCipher = new CaesarShiftCipher();
    }

    // TODO should put each line of code into a single testmethod, but as this is only exercise code no need to spend time on it.
    @Test
    public void test() {
        Assertions.assertEquals("def", caesarShiftCipher.CaesarShiftCipher("abc", 3));
        Assertions.assertEquals("d ef", caesarShiftCipher.CaesarShiftCipher("a bc", 3));
        Assertions.assertEquals("abd", caesarShiftCipher.CaesarShiftCipher("xya", 3));
        Assertions.assertEquals("ihg", caesarShiftCipher.CaesarShiftCipher("fed", 3));
        Assertions.assertEquals("xyz", caesarShiftCipher.CaesarShiftCipher("abc", -3));
        Assertions.assertEquals("invalid", caesarShiftCipher.CaesarShiftCipher("abC", -3));
    }
}
