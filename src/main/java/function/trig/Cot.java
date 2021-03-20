package function.trig;

import function.Function;

public class Cot extends Function {
    private Sin sin;
    private Cos cos;

    public Cot(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
        funcName = "cot(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();
        return cos.calc(x, accuracy) / sin.calc(x, accuracy);
    }
}
