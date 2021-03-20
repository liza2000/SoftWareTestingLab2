package function;

import function.log.LogFunction;
import function.trig.TrigFunction;

public class FuncSystem extends Function {
    private TrigFunction trigFunction;
    private LogFunction logFunction;

    public FuncSystem(TrigFunction trigFunction, LogFunction logFunction) {
        this.trigFunction = trigFunction;
        this.logFunction = logFunction;
        funcName="system(x)";
    }


    @Override
    public double calc(double x, double accuracy) {
            if (x <= 0) return trigFunction.calc(x, accuracy);

                return logFunction.calc(x, accuracy);
    }

}
