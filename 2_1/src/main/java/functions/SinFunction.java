package functions;

public class SinFunction implements ArgumentFunction {
    private double lowerBorder;
    private double upperBorder;
    private double arg1;
    private double arg2;

    public SinFunction(double a, double b, double arg1, double arg2) {
        this.lowerBorder = a;
        this.upperBorder = b;
        if (upperBorder < lowerBorder){
            throw new IllegalArgumentException("Верхняя граница меньше верхней");
        }
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public double functionValue(double x) {
        if (x < lowerBorder || x > upperBorder) {
            throw new IllegalArgumentException("Аргумент не входит в отрезок");

        }
        return ((arg1 * Math.sin(x * arg2)));
    }

    @Override
    public double getLowerBorder() {
        return lowerBorder;
    }

    @Override
    public double getUpperBorder() {
        return upperBorder;
    }
}
