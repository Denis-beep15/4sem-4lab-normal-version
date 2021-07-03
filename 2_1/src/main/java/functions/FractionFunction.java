package functions;

public class FractionFunction implements ArgumentFunction {
    private double lowerBorder;
    private double upperBorder;
    private double arg1;
    private double arg2;
    private double arg3;
    private double arg4;

    public FractionFunction(double a, double b, double arg1, double arg2, double arg3, double arg4) {
        this.lowerBorder = a;
        this.upperBorder = b;
        if (upperBorder < lowerBorder){
            throw new IllegalArgumentException("Верхняя граница меньше верхней");
        }
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
        this.arg4 = arg4;
    }

    @Override
    public double functionValue(double x) {
        if (x < lowerBorder || x > upperBorder) {
            throw new IllegalArgumentException("Аргумент не входит в отрезок");
        }
        return (((arg1 * x) + arg2) / ((arg3 * x) + arg4));
    }
    //должна быть проверка,чтобы функция не делила на 0

    @Override
    public double getLowerBorder() {
        return lowerBorder;
    }

    @Override
    public double getUpperBorder() {
        return upperBorder;
    }
}

