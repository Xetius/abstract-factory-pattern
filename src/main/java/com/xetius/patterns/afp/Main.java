package com.xetius.patterns.afp;

import com.xetius.patterns.afp.colour.Colour;
import com.xetius.patterns.afp.colour.ColourType;
import com.xetius.patterns.afp.factory.FactoryProducer;
import com.xetius.patterns.afp.factory.FactoryType;
import com.xetius.patterns.afp.shape.Shape;
import com.xetius.patterns.afp.shape.ShapeType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();

        Shape square = factoryProducer.getFactory(FactoryType.SHAPE).get(ShapeType.SQUARE);
        Shape circle = factoryProducer.getFactory(FactoryType.SHAPE).get(ShapeType.CIRCLE);
        Shape triangle = factoryProducer.getFactory(FactoryType.SHAPE).get(ShapeType.TRIANGLE);

        List<Shape> shapes = Arrays.asList(square, circle, triangle);

        Colour red = factoryProducer.getFactory(FactoryType.COLOUR).get(ColourType.RED);
        Colour green = factoryProducer.getFactory(FactoryType.COLOUR).get(ColourType.GREEN);
        Colour blue = factoryProducer.getFactory(FactoryType.COLOUR).get(ColourType.BLUE);

        List<Colour> colours = Arrays.asList(red, green, blue);

        shapes.forEach(shape -> System.out.println(shape.draw()));
        colours.forEach(colour -> System.out.println(colour.fill()));
    }
}
