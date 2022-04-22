package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

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
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(8);
        //When
        shapeCollector.addFigure(square);
        //Then
        assertTrue(shapeCollector.getFigures().contains(square));
    }




    @DisplayName("Test remove figure")
    @Test
    public void testRemoveFigure(){
        //Given
        Rectangle rectangle = new Rectangle(1, 10);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(rectangle);
        //When
        shapeCollector.removeFigure(rectangle);

        //Then
        assertFalse(shapeCollector.getFigures().contains(rectangle));
    }


    @DisplayName("Test get figure")
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Rectangle rectangle = new Rectangle(1, 10);
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
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10);
        shapeCollector.addFigure(square);

        //When
        List<Shape> newShape = shapeCollector.getFigures();

        //Then
        assertTrue(newShape.contains(square));

    }
}