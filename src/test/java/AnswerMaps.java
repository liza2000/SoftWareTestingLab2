import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnswerMaps {
    public final  HashMap<Double, Double> systemMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> trigonomMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> logarithmMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> cosMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> sinMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> tanMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> cotMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> secMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> cscMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> lnMap = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> log3Map = new HashMap<Double, Double>();
    public final  HashMap<Double, Double> log2Map = new HashMap<Double, Double>();
    AnswerMaps(){
        load("cos.csv",cosMap);
        load("cot.csv",cotMap);
        load("csc.csv",cscMap);
        load("ln.csv",lnMap);
        load("log2.csv",log2Map);
        load("log3.csv",log3Map);
        load("sec.csv",secMap);
        load("sin.csv",sinMap);
        load("tan.csv",tanMap);
        load("logFunction.csv",logarithmMap);
        load("trigFunction.csv",trigonomMap);
        load("system.csv",systemMap);
    }
    private void load(String res, HashMap<Double,Double> HashMap){
        Scanner scanner;
        FileReader fis;
        try {
            fis = new FileReader(getClass().getClassLoader().getResource(res).getFile());
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            return;
        }
        scanner  = new Scanner(fis);
        while (scanner.hasNextLine()){
            String[] args = scanner.nextLine().split(", ");
            HashMap.put(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        }
    }

    public  void main(String[] args) {
        new AnswerMaps();
    }
}
