package function.trig;

import function.Function;

public class Csc extends Function {
    private Sin sin;

    public Csc(Sin sin) {
        this.sin = sin;
        funcName="csc(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();

        return 1/sin.calc(x,accuracy);
    }
}
