package com.xetius.patterns.afp.factory;

import com.xetius.patterns.afp.colour.*;

public class ColourFactory extends AbstractFactory {
    @Override
    public Colour get(ColourType colour) {
        switch (colour) {
            case RED:
                return new Red();
            case GREEN:
                return new Green();
            case BLUE:
                return new Blue();
        }
        return null;
    }
}
