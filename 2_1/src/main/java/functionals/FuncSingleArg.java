package functionals;

import functions.ArgumentFunction;

public interface FuncSingleArg <T extends ArgumentFunction> {
    double valueFunctional(T func);
}
