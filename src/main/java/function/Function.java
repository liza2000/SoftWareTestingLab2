package function;

abstract public class Function {
    protected String funcName;
    public abstract double calc(double x, double accuracy);

    public String getFuncName() {
        return funcName;
    }
}