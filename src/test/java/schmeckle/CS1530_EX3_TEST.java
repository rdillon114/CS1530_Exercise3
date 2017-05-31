import org.junit.Test;
import static org.junit.Assert.*;

import schmeckle.CS1530_EX3;

/**
 *
 * @author rad85000
 */
public class CS1530_EX3_TEST {
    @Test
    public void testLazy4() {
        assertEquals(CS1530_EX3.Lazy(4), 11);
    }

    @Test
    public void testLazy0() {
        assertEquals(CS1530_EX3.Lazy(0), 1);
    }

    @Test
    public void testLazy2() {
        assertEquals(CS1530_EX3.Lazy(2), 4);
    }

    @Test
    public void testTri0() {
        assertEquals(CS1530_EX3.Tri(0), 0);
    }

    @Test
    public void testTri5() {
        assertEquals(CS1530_EX3.Tri(5), 15);
    }

    @Test
    public void testTri9() {
        assertEquals(CS1530_EX3.Tri(9), 45);
    }
}
