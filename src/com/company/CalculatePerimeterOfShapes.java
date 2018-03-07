package com.company;

public class CalculatePerimeterOfShapes {
    public double calculatePerimeter(String measurementValues) {
        if(measurementValues.contains("+")){
            return calculateAddition(measurementValues);
        }
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

    private double calculateMultiplication(String equation) {
        String[] numbers = equation.split("\\*");
        return calculatePerimeter(numbers[0]) * calculatePerimeter(numbers[1]);
    }
    private double calculateDivision(String equation) {
        String[] numbers = equation.split("\\/");
        return calculatePerimeter(numbers[0]) / calculatePerimeter(numbers[1]);
    }
    private double calculateAddition(String equation){
        String[] numbers = equation.split("\\+");
        double sum = 0.0;
        for(String number:numbers){
            sum +=calculatePerimeter(number);
        }
        return sum;
    }
}


