package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatePerimeterOfShapesTest {

    private static final double DELTA = 0.01;
    private CalculatePerimeterOfShapes perimeter;

    @BeforeEach
    public void beforeEachTest(){
        perimeter = new CalculatePerimeterOfShapes();
    }

    @Test
    public void WhenIHaveASquare(){
        String LengthBy4 = "2+2+2+2";
        double expectedResults = 8.0;

        double actualResults = perimeter.calculatePerimeter(LengthBy4);

        assertEquals(expectedResults, actualResults, DELTA);
    }

    @Test
    public void WhenIHaveARectangle(){
        String LengthBy2PlusWidthBy2 = "2+2+3+3";
        double expectedResults = 10.0;

        double actualResults = perimeter.calculatePerimeter(LengthBy2PlusWidthBy2);

        assertEquals(expectedResults, actualResults, DELTA);
    }

    @Test
    public void WhenIHaveACircle(){
        String PieByDiameter = "22/7*6";
        double expectedResults = 18.86;

        double actualResults = perimeter.calculatePerimeter(PieByDiameter);

        assertEquals(expectedResults, actualResults, DELTA);
    }
}

