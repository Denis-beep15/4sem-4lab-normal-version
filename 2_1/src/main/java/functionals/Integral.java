package functionals;

import functions.ArgumentFunction;

public class  Integral <T extends ArgumentFunction>  implements FuncSingleArg<T> {



    @Override
    public double valueFunctional(T func) {
        double summa = 0;
        System.out.println(func.getClass().getName());
        summa = func.functionValue(func.getLowerBorder()) +
                func.functionValue(func.getUpperBorder()) +
                func.functionValue((func.getUpperBorder() + func.getLowerBorder()) / 2);
        return (summa);
    }
}
