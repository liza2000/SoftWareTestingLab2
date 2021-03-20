import function.FuncSystem;
import function.Function;
import function.log.Ln;
import function.log.Log2;
import function.log.Log3;
import function.log.LogFunction;
import function.trig.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Math.*;

public class CSV {

    public static void logModuleToCSV(Function module, double from,
                                      double to, double step, double accuracy) {

        File file = new File("src/main/resources/" +
                module.getFuncName() + ".csv");

        try {
            FileWriter fr = new FileWriter(file);
            fr.write("X,"+module.getFuncName()+'\n');
            for (double i = from; i < to; i += step) {
                fr.write(String.valueOf(i));
                fr.write(',');
                fr.write(String.valueOf(module.calc(i, accuracy)));
                fr.write('\n');
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Sin sin = new Sin();
        Cos cos = new Cos(sin);
        Tan tan = new Tan(sin,cos);
        Cot cot = new Cot(sin,cos);
        Sec sec = new Sec(cos);
        Csc csc = new Csc(sin);
        Ln ln = new Ln();
        Log2 log2 = new Log2(ln);
        Log3 log3 = new Log3(ln);
        logModuleToCSV(new FuncSystem(new TrigFunction(cos,sin,tan,cot,sec,csc),new LogFunction(ln,log2,log3)),-5,3,0.1,1);
    }
}