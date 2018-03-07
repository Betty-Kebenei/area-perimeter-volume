package com.company;

public class CalculateAreaOfShapes {
    public double calculateArea(String measurementValues) {
        if(measurementValues.contains("*")){
            return calculateMultiplication(measurementValues);
        }
        if(measurementValues.contains("/")){
            return calculateDivision(measurementValues);
        }
        if(measurementValues.matches("[0-9]+")){
            return Double.parseDouble(measurementValues);
        }
        return Double.NaN;
    }
    private double calculateDivision(String equation) {
        String[] numbers = equation.split("\\/");
        return calculateArea(numbers[0]) / calculateArea(numbers[1]);
    }
    private double calculateMultiplication(String measurementValues){
        String[] numbers = measurementValues.split("\\*");
        double multiplication = 1.0;
        for(String number:numbers){
            multiplication *=calculateArea(number);
        }
        return multiplication;
    }
}
