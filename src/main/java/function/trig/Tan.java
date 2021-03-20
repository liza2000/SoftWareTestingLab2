package function.trig;

import function.Function;

public class Tan extends Function {
    private Sin sin;
    private Cos cos;
   public Tan(Sin sin, Cos cos){
        this.sin = sin;
        this.cos = cos;
        funcName="tan(x)";
    }
    @Override
    public double calc(double x, double accuracy) {
        if (accuracy <= 0)
            throw new IllegalArgumentException();

        return sin.calc(x,accuracy)/cos.calc(x,accuracy);
    }
}
