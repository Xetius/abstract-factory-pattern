package com.xetius.patterns.afp.factory;

public class FactoryProducer {
    public AbstractFactory getFactory(FactoryType factoryType) {
        if (null == factoryType) {
            return null;
        }

        if (factoryType.equals(FactoryType.SHAPE)) {
            return new ShapeFactory();
        }
        else {
            return new ColourFactory();
        }
    }
}
