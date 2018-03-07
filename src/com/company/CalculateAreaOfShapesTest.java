package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateAreaOfShapesTest {

    private static final double DELTA = 0.01;
    private CalculateAreaOfShapes area;

    @BeforeEach
    public void beforeEachTest(){
        area = new CalculateAreaOfShapes();
    }

    @Test
    public void WhenIHaveASquare(){
        String LengthByLength = "2*2";
        double expectedResults = 4.0;

        double actualResults = area.calculateArea(LengthByLength);

        assertEquals(expectedResults, actualResults, DELTA);
    }

    @Test
    public void WhenIHaveARectangle(){
        String LengthByWidth = "2*3";
        double expectedResults = 6.0;

        double actualResults = area.calculateArea(LengthByWidth);

        assertEquals(expectedResults, actualResults, DELTA);
    }

    @Test
    public void WhenIHaveACircle(){
        String PieByRadiusByRadius = "3.14*3*3";
        double expectedResults = 28.26;

        double actualResults = area.calculateArea(PieByRadiusByRadius);

        assertEquals(expectedResults, actualResults, DELTA);
    }
}
