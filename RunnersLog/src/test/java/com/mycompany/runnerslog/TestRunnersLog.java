package com.mycompany.runnerslog;

import junit.framework.TestCase;

public class TestRunnersLog extends TestCase {

    public void testComputePace() {
        Entry e1 = new Entry(new Date(1, 6, 2026), 5.0, 45, "great");
        assertEquals(e1.computePace(), 9.0, 0.001);

        Entry e2 = new Entry(new Date(2, 6, 2026), 10.0, 80, "tired");
        assertEquals(e2.computePace(), 8.0, 0.001);
    }

    public void testIsBefore() {
        Date d1 = new Date(1, 6, 2026);
        Date d2 = new Date(15, 6, 2026);
        Date d3 = new Date(1, 7, 2026);
        Date d4 = new Date(1, 6, 2027);

        assertTrue(d1.isBefore(d2));   // cung nam, cung thang, ngay som hon
        assertTrue(d2.isBefore(d3));   // cung nam, thang som hon
        assertTrue(d3.isBefore(d4));   // nam som hon
        assertFalse(d2.isBefore(d1));
        assertFalse(d1.isBefore(d1));  // cung 1 ngay khong tinh la "truoc"
    }
}
