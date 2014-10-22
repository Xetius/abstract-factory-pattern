package com.xetius.patterns.afp.factory;

import com.xetius.patterns.afp.colour.*;
import com.xetius.patterns.afp.shape.Circle;
import com.xetius.patterns.afp.shape.Shape;
import com.xetius.patterns.afp.shape.ShapeType;
import com.xetius.patterns.afp.shape.Triangle;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class AbstractFactoryTest {
    private FactoryProducer factoryProducer;
    private AbstractFactory shapeFactory;
    private AbstractFactory colourFactory;

    @Before
    public void setUp() throws Exception {
        factoryProducer = new FactoryProducer();
        shapeFactory = factoryProducer.getFactory(FactoryType.SHAPE);
        colourFactory = factoryProducer.getFactory(FactoryType.COLOUR);
    }

    @Test
    public void shapeFactoryReturnsNullFromGetColour() throws Exception {
        Colour colour = shapeFactory.get(ColourType.RED);
        assertThat(colour, is(nullValue()));
    }

    @Test
    public void colourFactoryReturnsNullValueFromGetShape() throws Exception {
        Shape shape = colourFactory.get(ShapeType.SQUARE);
        assertThat(shape, is(nullValue()));
    }

    @Test
    public void shapeFactoryReturnsSquareFromGetWithTypeSquare() throws Exception {
        Shape shape = shapeFactory.get(ShapeType.SQUARE);
        assertThat(shape, instanceOf(Shape.class));
    }

    @Test
    public void shapeFactoryReturnsCircleFromGetWithTypeCircle() throws Exception {
        Shape shape = shapeFactory.get(ShapeType.CIRCLE);
        assertThat(shape, instanceOf(Circle.class));
    }

    @Test
    public void shapeFactoryReturnsTriangleFromGetWithTypeTriangle() throws Exception {
        Shape shape = shapeFactory.get(ShapeType.TRIANGLE);
        assertThat(shape, instanceOf(Triangle.class));
    }

    @Test
    public void colourFactoryReturnsRedFromGetWithTypeRed() throws Exception {
        Colour colour = colourFactory.get(ColourType.RED);
        assertThat(colour, instanceOf(Red.class));
    }

    @Test
    public void colourFactoryReturnsBlueFromGetWithTypeBlue() throws Exception {
        Colour colour = colourFactory.get(ColourType.BLUE);
        assertThat(colour, instanceOf(Blue.class));
    }

    @Test
    public void colourFactoryReturnsGreenFromGetWithTypeGreen() throws Exception {
        Colour colour = colourFactory.get(ColourType.GREEN);
        assertThat(colour, instanceOf(Green.class));
    }
}
