package com.xetius.patterns.afp.factory;

import com.xetius.patterns.afp.shape.*;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape get(ShapeType shape) {
        switch (shape) {
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
        }
        return null;
    }
}
