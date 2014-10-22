package com.xetius.patterns.afp.factory;

import com.xetius.patterns.afp.colour.Colour;
import com.xetius.patterns.afp.colour.ColourType;
import com.xetius.patterns.afp.shape.Shape;
import com.xetius.patterns.afp.shape.ShapeType;

public class AbstractFactory {
    public Shape get(ShapeType shape) {
        return null;
    }

    public Colour get(ColourType colour) {
        return null;
    }
}
