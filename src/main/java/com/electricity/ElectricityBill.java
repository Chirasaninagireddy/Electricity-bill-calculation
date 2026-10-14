package com.electricity;

public class ElectricityBill {

    public double calculateBill(int units) {
        if (units < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative"
            );
        }

        if (units <= 100) {
            return units * 2.0;
        } else if (units <= 200) {
            return 200.0 + (units - 100) * 3.0;
        } else {
            return 500.0 + (units - 200) * 5.0;
        }
    }

    public double calculateTotalBill(int units) {
        return calculateBill(units) + 50.0;
    }

    public int calculateUnitsConsumed(
            int previousReading, int currentReading) {

        if (previousReading < 0 || currentReading < 0) {
            throw new IllegalArgumentException(
                "Meter readings cannot be negative"
            );
        }

        if (currentReading < previousReading) {
            throw new IllegalArgumentException(
                "Current reading cannot be less than previous reading"
            );
        }

        return currentReading - previousReading;
    }
}