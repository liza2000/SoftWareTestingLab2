package function.trig;

import function.Function;

import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Sin extends Function {
    public Sin() {
        funcName="sin(x)";
    }

    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();
        accuracy*=0.0001;
        x %= 2 * PI;
        boolean minus = false;
        if (x <= -PI && x > -PI * 2)
            x = x + 2 * PI;


        if(x<0 && x>-PI){
            x+= PI;
            minus = true;
        }

        if (x > PI && x <= PI * 2) {
            x = 2 * PI - x;
            minus = true;
        }

        if (x <= PI && x > PI / 2)
            x = PI - x;

        double sum = 0;
        double member = x;
        for(int n = 0; abs(member)>=accuracy;n++){
            member = pow(x,2*n+1)/getFactorial(2*n+1);
            sum+=n%2==0?member:-member;
        }
        return minus?-sum:sum;
    }


    private int getFactorial(int n) {
        if (n==0) return 1;
        return  n * getFactorial(n - 1);
    }
}
