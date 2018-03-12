package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CalculateAreaOfShapes areaOfShapes = new CalculateAreaOfShapes();
        CalculatePerimeterOfShapes perimeterOfShapes = new CalculatePerimeterOfShapes();

        Scanner input = new Scanner(System.in);
        int repeat = 1;

        while(repeat==1){
            System.out.println(
                    "Choose a shape to get its area and perimeter, or volume for 3D shapes?"+ "\n" +
                            "1. Square"+ "\n" +
                            "2. Rectangle"+ "\n" +
                            "3. Circle"+ "\n" +
                            "Reply with 1, 2, or 3:"+ "\n"
            );
            int choice = input.nextInt();
            if(choice==1){
                System.out.println("Please enter its length:");
                int length = input.nextInt();
                String areaFormula = Integer.toString(length*length);
                double areaOfSquare = areaOfShapes.calculateArea(areaFormula);
                String perimeterFormula = Integer.toString(4*length);
                double perimeterOfSquare = perimeterOfShapes.calculatePerimeter(perimeterFormula);
                System.out.println(
                        "Length of square:"+"\t"+
                                length +"\n"+
                                "Area of Square" +"\t" +
                                areaOfSquare+"\n"+
                                "Perimeter of Square"+"\t" +
                                perimeterOfSquare
                );
            }
            else if(choice==2){
                System.out.println("Please enter its length:");
                int length = input.nextInt();
                System.out.println("Please enter its width:");
                int width = input.nextInt();
                String areaFormula = Integer.toString(length*width);
                double areaOfRectangle = areaOfShapes.calculateArea(areaFormula);
                String perimeterFormula = Integer.toString(2*length+2*width);
                double perimeterOfRectangle = perimeterOfShapes.calculatePerimeter(perimeterFormula);
                System.out.println(
                        "Length of rectangle:"+"\t"+
                                length +"\n" +
                                "Width of rectangle:"+"\t"+
                                width +"\n" +
                                "Area of rectangle:"+"\t"+
                                areaOfRectangle+"\n"+
                                "Perimeter of rectangle:"+"\t"+
                                perimeterOfRectangle
                );
            }
            else if(choice==3){
                System.out.println("Please enter its radius:");
                double radius = input.nextDouble();
                String areaFormula = Double.toString(22/7*radius*radius);
                double areaOfCircle = areaOfShapes.calculateArea(areaFormula);
                String perimeterFormula = Double.toString(22/7*2*radius);
                double perimeterOfCircle = perimeterOfShapes.calculatePerimeter(perimeterFormula);
                System.out.println(
                        "Radius of circle"+"\t"+
                                radius +"\n" +
                                "Area of circle" +"\t" +
                                areaOfCircle +"\n" +
                                "Perimeter of circle" +"\t" +
                                perimeterOfCircle
                );
            }
            else{
                System.out.println(
                        "Please enter a valid option: " +"\n" +
                                "1 for square or " +"\n" +
                                "2 for rectangle or" +"\n" +
                                "3 for circle."+"\n"
                );
            }
            System.out.println("Do you still want to continue?" +"\n" +
                            "1 for yes " +"\n" +
                            "Any number for no"
            );
            repeat = input.nextInt();
        }

    }
}
