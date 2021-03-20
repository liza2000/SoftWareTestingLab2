package function.trig;

import function.Function;

import static java.lang.Math.*;

public class Cos extends Function {
    private Sin sin;
   public Cos(Sin sin){
        this.sin = sin;
        funcName="cos(x)";
    }
    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();

        double arg = abs(x%(2*PI));
        if (arg<PI/2||arg>PI*1.5)
            return sqrt(1-pow(sin.calc(x,accuracy),2));
        return -sqrt(1-pow(sin.calc(x,accuracy),2));
    }
}
