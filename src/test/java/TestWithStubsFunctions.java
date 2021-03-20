import function.FuncSystem;
import function.log.LogFunction;
import function.trig.TrigFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

public class TestWithStubsFunctions {
    private LogFunction logarithmic;
    private TrigFunction trigonometric;
    private FuncSystem funcSystem;
    private AnswerMaps answerMaps = new AnswerMaps();

    private double accuracy = 0.01;

    TestWithStubsFunctions(){
        trigonometric = Mockito.mock(TrigFunction.class);

        when(trigonometric.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.trigonomMap.get(invocation.getArgument(0)));

        logarithmic = Mockito.mock(LogFunction.class);

        when(logarithmic.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.logarithmMap.get(invocation.getArgument(0)));
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
