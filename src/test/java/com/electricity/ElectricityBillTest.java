package com.electricity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricityBillTest {

    private final ElectricityBill bill = new ElectricityBill();

    @Test
    void testCalculateBill() {
        assertEquals(200.0, bill.calculateBill(100), 0.01);
    }

    @Test
    void testCalculateTotalBill() {
        assertEquals(250.0, bill.calculateTotalBill(100), 0.01);
    }

    @Test
    void testCalculateUnitsConsumed() {
        assertEquals(150, bill.calculateUnitsConsumed(500, 650));
    }

    @Test
    void testNegativeUnits() {
        assertThrows(IllegalArgumentException.class,
                () -> bill.calculateBill(-10));
    }
}