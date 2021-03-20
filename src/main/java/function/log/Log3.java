package function.log;

import function.Function;

public class Log3 extends Function {
    private Ln ln;

    public Log3(Ln ln) {
        this.ln = ln;
        funcName="log3(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        return ln.calc(x, accuracy) / ln.calc(3.0, accuracy);
    }
}
