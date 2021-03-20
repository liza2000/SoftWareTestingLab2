package function.trig;

import function.Function;

import static java.lang.Math.pow;

public class TrigFunction extends Function {
    private Cos cos;
    private Sin sin;
    private Tan tan;
    private Cot cot;
    private Sec sec;
    private Csc csc;

    public TrigFunction(Cos cos, Sin sin, Tan tan, Cot cot, Sec sec, Csc csc) {
        this.cos = cos;
        this.sin = sin;
        this.tan = tan;
        this.cot = cot;
        this.sec = sec;
        this.csc = csc;
        funcName="trigFunction.csv(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        return (((((pow(cot.calc(x,accuracy), 3) * cot.calc(x,accuracy)) + (sin.calc(x,accuracy)
                + cot.calc(x,accuracy))) + (cot.calc(x,accuracy) + tan.calc(x,accuracy))) * (((sec.calc(x,accuracy)
                + tan.calc(x,accuracy)) + sec.calc(x,accuracy)) / pow((cos.calc(x,accuracy) - sin.calc(x,accuracy)), 3))) / (((csc.calc(x,accuracy)
                + (tan.calc(x,accuracy) / cos.calc(x,accuracy))) + pow(sin.calc(x,accuracy), 2)) - ((csc.calc(x,accuracy) / csc.calc(x,accuracy))
                - (tan.calc(x,accuracy) / cos.calc(x,accuracy)))));
    }
}
