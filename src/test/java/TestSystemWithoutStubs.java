import function.FuncSystem;
import function.log.Ln;
import function.log.Log2;
import function.log.Log3;
import function.log.LogFunction;
import function.trig.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSystemWithoutStubs {
    AnswerMaps answerMaps = new AnswerMaps();
FuncSystem funcSystem;
LogFunction logFunction;
TrigFunction trigFunction;
Sin sin;
Cos cos;
Sec sec;
Csc csc;
Cot cot;
Tan tan;
Ln ln;
Log2 log2;
Log3 log3;
double accuracy=0.5;


public TestSystemWithoutStubs(){
    sin = new Sin();
    cos = new Cos(sin);
    tan = new Tan(sin,cos);
    cot = new Cot(sin,cos);
    sec = new Sec(cos);
    csc = new Csc(sin);
    ln = new Ln();
    log2 = new Log2(ln);
    log3 = new Log3(ln);
    trigFunction = new TrigFunction(cos,sin,tan,cot,sec,csc);
    logFunction = new LogFunction(ln,log2,log3);
    funcSystem = new FuncSystem(trigFunction,logFunction);
}
        @Test
    public void test5(){
            Assertions.assertEquals(funcSystem.calc(-5,accuracy),answerMaps.trigonomMap.get(-5.0),accuracy);
    }
    @Test
    public void test45(){
        Assertions.assertEquals(funcSystem.calc(-4.5,accuracy),answerMaps.trigonomMap.get(-4.5),accuracy);
    }
    @Test
    public void test4(){
        Assertions.assertEquals(funcSystem.calc(-4,accuracy),answerMaps.trigonomMap.get(-4.0),accuracy);
    }
    @Test
    public void test35(){
        Assertions.assertEquals(funcSystem.calc(-3.5,accuracy),answerMaps.trigonomMap.get(-3.5),accuracy);
    }
    @Test
    public void test3(){
        Assertions.assertEquals(funcSystem.calc(-3,accuracy),answerMaps.trigonomMap.get(-3.0),accuracy);
    }
    @Test
    public void test25(){
        Assertions.assertEquals(funcSystem.calc(-2.5,accuracy),answerMaps.trigonomMap.get(-2.5),accuracy);
    }
    @Test
    public void test2(){
        Assertions.assertEquals(funcSystem.calc(-2,accuracy),answerMaps.trigonomMap.get(-2.0),accuracy);
    }
      @Test
    public void test15(){
        Assertions.assertEquals(funcSystem.calc(-1.5,accuracy),answerMaps.trigonomMap.get(-1.5),accuracy);
    }
    @Test
    public void test1(){
        Assertions.assertEquals(funcSystem.calc(-1,accuracy),answerMaps.trigonomMap.get(-1.0),accuracy);
    }
    @Test
    public void test_1(){
        Assertions.assertEquals(funcSystem.calc(1,accuracy),answerMaps.logarithmMap.get(1.0),accuracy);
    }

    @Test
    public void test_15(){
        Assertions.assertEquals(funcSystem.calc(1.5,accuracy),answerMaps.logarithmMap.get(1.5),accuracy);
    }
    @Test
    public void test_2(){
        Assertions.assertEquals(funcSystem.calc(2,accuracy),answerMaps.logarithmMap.get(2.0),accuracy);
    }
    @Test
    public void test_25(){
        Assertions.assertEquals(funcSystem.calc(2.5,accuracy),answerMaps.logarithmMap.get(2.5),accuracy);
    }
    @Test
    public void test_3(){
        Assertions.assertEquals(funcSystem.calc(3,accuracy),answerMaps.logarithmMap.get(3.0),accuracy);
    }
    @Test
    public void test_35(){
        Assertions.assertEquals(funcSystem.calc(3.5,accuracy),answerMaps.logarithmMap.get(3.5),accuracy);
    }
    @Test
    public void test_4(){
        Assertions.assertEquals(funcSystem.calc(4,accuracy),answerMaps.logarithmMap.get(4.0),accuracy);
    }
}
