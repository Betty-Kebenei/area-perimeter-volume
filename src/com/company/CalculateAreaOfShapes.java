package com.company;

public class CalculateAreaOfShapes {
    public double calculateArea(String measurementValues) {
        if(measurementValues.contains("*")){
            return calculateMultiplication(measurementValues);
        }
        if(measurementValues.matches("[+-]?([0-9]*[.])?[0-9]+")){
            return Double.parseDouble(measurementValues);

        }
        return Double.NaN;
    }

    private double calculateMultiplication(String measurementValues) {
        String[] numbers = measurementValues.split("\\*");
        return calculateArea(numbers[0]) * calculateArea(numbers[1]);
    }
}
