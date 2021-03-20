package function.log;

import function.Function;

public class Log2 extends Function {
    private Ln ln;

    public Log2(Ln ln) {
        this.ln = ln;
        funcName="log2(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        return ln.calc(x, accuracy) / ln.calc(2.0, accuracy);
    }
}
