package org.example.changefromautomaticcash;

import org.junit.jupiter.api.Test;

import static org.example.changefromautomaticcash.AutomaticCash.calculateChange;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
class AutomaticCashTest {

    @Test
    void throwException_whenCalculateChangeIsImpossible() {
        assertThrows(Exception.class, () -> calculateChange(0));
        assertThrows(Exception.class, () -> calculateChange(1));
        assertThrows(Exception.class, () -> calculateChange(3));
    }

    @Test
    void returnChange_whenCalculateChangeIsPossible() throws Exception {
        Change changeExpectedFor2 = new Change(0, 0, 1);
        assertEquals(changeExpectedFor2, calculateChange(2));

        Change changeExpectedFor4 = new Change(0, 0, 2);
        assertEquals(changeExpectedFor4, calculateChange(4));

        Change changeExpectedFor5 = new Change(0, 1, 0);
        assertEquals(changeExpectedFor5, calculateChange(5));

        Change changeExpectedFor6 = new Change(0, 0, 3);
        assertEquals(changeExpectedFor6, calculateChange(6));

        Change changeExpectedFor7 = new Change(0, 1, 1);
        assertEquals(changeExpectedFor7, calculateChange(7));

        Change changeExpectedFor8 = new Change(0, 0, 4);
        assertEquals(changeExpectedFor8, calculateChange(8));

        Change changeExpectedFor9 = new Change(0, 1, 2);
        assertEquals(changeExpectedFor9, calculateChange(9));

        Change changeExpectedFor10 = new Change(1, 0, 0);
        assertEquals(changeExpectedFor10, calculateChange(10));

        Change changeExpectedFor11 = new Change(0, 1, 3);
        assertEquals(changeExpectedFor11, calculateChange(11));

        Change changeExpectedFor12 = new Change(1, 0, 1);
        assertEquals(changeExpectedFor12, calculateChange(12));

        Change changeExpectedFor13 = new Change(0, 1, 4);
        assertEquals(changeExpectedFor13, calculateChange(13));

        Change changeExpectedFor14 = new Change(1, 0, 2);
        assertEquals(changeExpectedFor14, calculateChange(14));

        Change changeExpectedFor15 = new Change(1, 1, 0);
        assertEquals(changeExpectedFor15, calculateChange(15));

        Change changeExpectedFor16 = new Change(1, 0, 3);
        assertEquals(changeExpectedFor16, calculateChange(16));

        Change changeExpectedFor17 = new Change(1, 1, 1);
        assertEquals(changeExpectedFor17, calculateChange(17));

        Change changeExpectedFor18 = new Change(1, 0, 4);
        assertEquals(changeExpectedFor18, calculateChange(18));

        Change changeExpectedFor19 = new Change(1, 1, 2);
        assertEquals(changeExpectedFor19, calculateChange(19));

        Change changeExpectedFor20 = new Change(2, 0, 0);
        assertEquals(changeExpectedFor20, calculateChange(20));

        Change changeExpectedFor21 = new Change(1, 1, 3);
        assertEquals(changeExpectedFor21, calculateChange(21));

        Change changeExpectedFor22 = new Change(2, 0, 1);
        assertEquals(changeExpectedFor22, calculateChange(22));

        Change changeExpectedFor23 = new Change(1, 1, 4);
        assertEquals(changeExpectedFor23, calculateChange(23));

        Change changeExpectedFor24 = new Change(2, 0, 2);
        assertEquals(changeExpectedFor24, calculateChange(24));

        Change changeExpectedFor25 = new Change(2, 1, 0);
        assertEquals(changeExpectedFor25, calculateChange(25));

        Change changeExpectedFor26 = new Change(2, 0, 3);
        assertEquals(changeExpectedFor26, calculateChange(26));

        Change changeExpectedFor58 = new Change(5, 0, 4);
        assertEquals(changeExpectedFor58, calculateChange(58));

        Change changeExpectedFor224 = new Change(22, 0, 2);
        assertEquals(changeExpectedFor224, calculateChange(224));

        Change changeExpectedFor1047 = new Change(104, 1, 1);
        assertEquals(changeExpectedFor1047, calculateChange(1047));
    }
}
