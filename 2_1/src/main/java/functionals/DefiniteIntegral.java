package functionals;

import functions.ArgumentFunction;

public class DefiniteIntegral <T extends ArgumentFunction>  implements FuncSingleArg<T> {
    private double aI;
    private double bI;



    public DefiniteIntegral(double aI, double bI) {
        this.aI = aI;
        this.bI = bI;
        if (bI < aI){
            throw new IllegalArgumentException("Верхняя граница интеграла меньше верхней");
        }
    }

    @Override
    public double valueFunctional(T func) throws IllegalArgumentException{
        if (func.getLowerBorder() <= aI && func.getUpperBorder() >= bI) {
            return (func.functionValue((aI+bI)/2) * (bI - aI));
        }
        else throw new IllegalArgumentException("Не корректные границы отрезков");
    }
}
