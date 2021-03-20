package function.log;

import function.Function;

import static java.lang.Math.pow;

public class LogFunction extends Function {
    private Ln ln;
    private Log2 log2;
    private Log3 log3;

    public LogFunction(Ln ln, Log2 log2, Log3 log3) {
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        funcName = "logFunction(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        return ((pow(pow(log2.calc(x,accuracy/10),3) , 3) * log3.calc(x,accuracy)) - log3.calc(x,accuracy))
                - (log2.calc(x,accuracy) + ln.calc(x,accuracy));
    }
}
