package com.xetius.patterns.afp.factory;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.core.IsNull.nullValue;

public class FactoryProducerTest {

    private FactoryProducer factoryProducer;

    @Before
    public void setUp() throws Exception {
        factoryProducer = new FactoryProducer();
    }

    @Test
    public void getFactoryWithShapeTypeReturnsShapeFactory() throws Exception {
        AbstractFactory abstractFactory = factoryProducer.getFactory(FactoryType.SHAPE);
        assertThat(abstractFactory, instanceOf(ShapeFactory.class));
    }

    @Test
    public void getFactoryWithColourTypeReturnsColourFactory() throws Exception {
        AbstractFactory abstractFactory = factoryProducer.getFactory(FactoryType.COLOUR);
        assertThat(abstractFactory, instanceOf(ColourFactory.class));
    }

    @Test
    public void getFactoryWithAnyOtherValueReturnsNull() throws Exception {
        AbstractFactory abstractFactory = factoryProducer.getFactory(null);
        assertThat(abstractFactory, is(nullValue()));

    }
}