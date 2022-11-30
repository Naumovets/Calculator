import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void add() {
        double expected = 15;
        double result =  calc.add(10,5);
        assertEquals(expected,result,0.001);
        double expected2 = 43;
        double result2 =  calc.add(21,22);
        assertEquals(expected2,result2,0.001);
        double expected3 = 777;
        double result3 =  calc.add(333,444);
        assertEquals(expected3,result3,0.001);
        double expected4 = 155;
        double result4 =  calc.add(12,143);
        assertEquals(expected4,result4,0.001);
    }

    @Test
    void multiplication() {
        double expected = 10;
        double result = calc.multiplication(2,5);
        assertEquals(expected,result,0.001);
        double expected2= 11;
        double result2 = calc.multiplication(2.2,5);
        assertEquals(expected2,result2,0.001);
        double expected3 = 44;
        double result3 = calc.multiplication(11,4);
        assertEquals(expected3,result3,0.001);
        double expected4 = 123.32;
        double result4 = calc.multiplication(12.332,10);
        assertEquals(expected4,result4,0.001);

    }

    @Test
    void subtract() {
        double expected = 17;
        double result = calc.subtract(10,-7);
        assertEquals(expected,result,0.001);
        double expected2 = 20;
        double result2 = calc.subtract(30,10);
        assertEquals(expected2,result2,0.001);
        double expected3 = 10;
        double result3 = calc.subtract(13.5,3.5);
        assertEquals(expected3,result3,0.001);
        double expected4 = 232.2;
        double result4 = calc.subtract(300,67.8);
        assertEquals(expected4,result4,0.001);
    }

    @Test
    void devide() {
        double expected = 5.5;
        double result = calc.devide(11,2);
        assertEquals(expected,result,0.001);
        double expected2 = 19;
        double result2 = calc.devide(38,2);
        assertEquals(expected2,result2,0.001);
        double expected3 = 11.7;
        double result3 = calc.devide(5.85,0.5);
        assertEquals(expected3,result3,0.001);
        double expected4 = 53.11;
        double result4 = calc.devide(159.33,3);
        assertEquals(expected4,result4,0.001);
    }
}