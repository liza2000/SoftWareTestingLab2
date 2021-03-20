import function.FuncSystem;
import function.log.Ln;
import function.log.Log2;
import function.log.Log3;
import function.log.LogFunction;
import function.trig.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;


public class TestWithStubsPartsOfFunctions {
    private LogFunction logarithmic;
    private TrigFunction trigonometric;
    private FuncSystem funcSystem;
    private Cos cos;
    private Sin sin;
    private Cot cot;
    private Tan tan;
    private Ln ln;
    private Log3 log3;
    private Log2 log2;
    private Sec sec;
    private Csc csc;
    private AnswerMaps answerMaps = new AnswerMaps();
    private double accuracy = 0.1;

    TestWithStubsPartsOfFunctions(){
        sec = Mockito.mock(Sec.class);
        csc = Mockito.mock(Csc.class);
        cos = Mockito.mock(Cos.class);
        sin = Mockito.mock(Sin.class);
        cot = Mockito.mock(Cot.class);
        tan = Mockito.mock(Tan.class);
        when(cos.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.cosMap.get(invocation.getArgument(0)));
        when(sec.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.secMap.get(invocation.getArgument(0)));
        when(csc.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.cscMap.get(invocation.getArgument(0)));

        when(sin.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.sinMap.get(invocation.getArgument(0)));

        when(cot.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.cotMap.get(invocation.getArgument(0)));

        when(tan.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.tanMap.get(invocation.getArgument(0)));
        ln = Mockito.mock(Ln.class);
        log3 = Mockito.mock(Log3.class);
        log2 = Mockito.mock(Log2.class);

        when(ln.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.lnMap.get(invocation.getArgument(0)));

        when(log3.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.log3Map.get(invocation.getArgument(0)));

        when(log2.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.log2Map.get(invocation.getArgument(0)));


        logarithmic = new LogFunction(ln, log2, log3);
        trigonometric = new TrigFunction(cos,sin,tan,cot,sec,csc);
        funcSystem = new FuncSystem(trigonometric, logarithmic);
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
    @Test
    public void test_45(){
        Assertions.assertEquals(funcSystem.calc(4.5,accuracy),answerMaps.logarithmMap.get(4.5),accuracy);
    }
    @Test
    public void test_5(){
        Assertions.assertEquals(funcSystem.calc(5,accuracy),answerMaps.logarithmMap.get(5.0),accuracy);
    }
}
