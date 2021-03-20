package function.trig;

import function.Function;

public class Sec extends Function {
   private Cos cos;

    public Sec(Cos cos) {
        this.cos = cos;
        funcName="sec(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();

        return 1/cos.calc(x,accuracy);
    }
}
