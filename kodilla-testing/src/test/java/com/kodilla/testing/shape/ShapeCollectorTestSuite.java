package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCount = 0;

    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("Starting test process...");
    }

    @AfterAll
    public static void afterAllTest() {
        System.out.println("End of test.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCount++;
        System.out.println("Starting test number" + testCount);
    }



    @DisplayName("Test add figure")
    @Test
    public void testAddFigure() {

        //Given
        Square square = new Square(8);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        //When
        shapeCollector.addFigure(square);
        //Then
        assertTrue(shapeCollector.showFigures().contains(square));
    }




    @DisplayName("Test remove figure")
    @Test
    public void testRemoveFigure(){

        //Given
        Rectangle rectangle = new Rectangle(1, 10);
        ShapeCollector shapeCollector = new ShapeCollector(rectangle);
        shapeCollector.addFigure(rectangle);
        //When
        shapeCollector.removeFigure(rectangle);

        //Then
        assertFalse(shapeCollector.showFigures().contains(rectangle));

    }


    @DisplayName("Test get figure")
    @Test
    public void testGetFigure(){

        //Given
        Rectangle rectangle = new Rectangle(1, 10);
        ShapeCollector shapeCollector = new ShapeCollector(rectangle);
        shapeCollector.addFigure(rectangle);

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        assertEquals(rectangle, figure);

    }


    @DisplayName("Test showFigures")
    @Test
    public void testShowFigures(){

        //Given
        Square square = new Square(10);
        ShapeCollector shapeCollector = new ShapeCollector(square);
        shapeCollector.addFigure(square);

        //When
        ArrayList<Shape> newShape = shapeCollector.showFigures();

        //Then
        assertTrue(newShape.contains(square));

    }
}