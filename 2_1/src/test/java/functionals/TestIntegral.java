package functionals;

import functions.ExpFunction;
import functions.FractionFunction;
import functions.LinearEquation;
import functions.SinFunction;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestIntegral {
    private final  static  double DELTA = 1e-5;

    @Test
    public void testExecute() {
        ExpFunction func = new ExpFunction(0,2, 1,1);
        Integral<ExpFunction> integral = new Integral<ExpFunction>();
        assertEquals(14.10733, integral.valueFunctional(func), DELTA);
    }
    @Test
    public void testExecuteSin() {
        SinFunction func = new SinFunction(0,1, 1,1);
        Integral<SinFunction> integral = new Integral<SinFunction>();
        assertEquals(1.32089, integral.valueFunctional(func), DELTA);
    }
    @Test
    public void testExecuteLinear() {
        LinearEquation func = new LinearEquation(0,1, 1,1);
        Integral<LinearEquation> integral = new Integral<LinearEquation>();
        assertEquals(4.50000, integral.valueFunctional(func), DELTA);
    }
    @Test
    public void testExecuteFraction() {
        FractionFunction func = new FractionFunction(0,1, 1,1,1,1 );
        Integral<FractionFunction> integral = new Integral<FractionFunction>();
        assertEquals(3, integral.valueFunctional(func), DELTA);
    }
    @Test
    public void testIntegralSin(){
        SinFunction func = new SinFunction(1,3,1,1);
        DefiniteIntegral<SinFunction> definiteIntegral = new DefiniteIntegral<SinFunction>(1, 2);
        assertEquals(0.99749,definiteIntegral.valueFunctional(func), DELTA);
    }
    @Test
    public void testIntegralExp(){
        ExpFunction func = new ExpFunction(1,3,1,1);
        DefiniteIntegral<ExpFunction> definiteIntegral = new DefiniteIntegral<ExpFunction>(1,2);
        assertEquals(5.48168,definiteIntegral.valueFunctional(func), DELTA);
    }
    @Test
    public void testIntegralFraction(){
        FractionFunction func = new FractionFunction(1,3,1,1,1,1);
        DefiniteIntegral<FractionFunction> definiteIntegral = new DefiniteIntegral<FractionFunction>(1,2);
        assertEquals(1,definiteIntegral.valueFunctional(func), DELTA);
    }
    @Test
    public void testIntegralLinear(){
        LinearEquation func = new LinearEquation(1,3,1,1);
        DefiniteIntegral<LinearEquation> definiteIntegral = new DefiniteIntegral<LinearEquation>(1,2);
        assertEquals(2.5,definiteIntegral.valueFunctional(func), DELTA);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExecute1() {
        ExpFunction func = new ExpFunction(3, 2, 1, 1);
        Integral<ExpFunction> integral = new Integral<ExpFunction>();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExecute2() {
        LinearEquation func = new LinearEquation(3, 2, 1, 1);
        Integral<LinearEquation> integral = new Integral<LinearEquation>();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIntegralLinear1() {
        LinearEquation func = new LinearEquation(4,3,1,1);
        DefiniteIntegral<LinearEquation> definiteIntegral = new DefiniteIntegral<LinearEquation>(1,2);
    }
}
