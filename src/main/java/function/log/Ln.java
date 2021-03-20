package function.log;

import function.Function;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Ln extends Function {
    public Ln(){
        funcName="ln(x)";
    }

    @Override
    public double calc(double x, double accuracy) {

        if (accuracy <= 0 || x < 0 || abs(x) == Double.POSITIVE_INFINITY)
            throw new IllegalArgumentException();
            accuracy*=0.001;
        if (x == 0) return Double.NEGATIVE_INFINITY;

        if (x > 2) return calc(x / 2.0, accuracy) + calc(2.0, accuracy);

        double member = x;
        double sum = 0;
        for(int n=1;abs(member)>=accuracy;n++){
            member = pow(x - 1, n) / n;
            sum += n%2==0?-member:member;
        }

        return sum;
    }

}
