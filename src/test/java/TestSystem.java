import function.FuncSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

public class TestSystem {
    private FuncSystem funcSystem;

    private double x;
    private double expected;
    private double accuracy = 0.0001;
    private AnswerMaps answerMaps = new AnswerMaps();

    private TestSystem() {
        funcSystem = Mockito.mock(FuncSystem.class);

        when(funcSystem.calc(anyDouble(), anyDouble())).
                thenAnswer(invocation -> answerMaps.systemMap.get(invocation.getArgument(0)));
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
