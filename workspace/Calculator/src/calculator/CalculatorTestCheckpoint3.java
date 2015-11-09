package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
CHECKPOINT 3 UNIT TESTS

To run these tests, just click somewhere inside this file (but NOT on the name of the test case!!), 
and click the Play button. The results will appear on the left, under JUnit tab.  Your code should pass all the tests
before submitting this checkpoint.

Stats should say: Runs: 25/25     Errors: 0       Failures: 0
 */
public class CalculatorTestCheckpoint3
{
    @Test public void testError1() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("2 -"));}   
    @Test public void testError2() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("1 *"));}
    @Test public void testError3() {assertEquals("<ERROR> Invalid expression format.", Calculator.produceAnswer("7 /"));}   
    @Test public void testError4() {assertEquals("<ERROR> Invalid operator encountered: %", Calculator.produceAnswer("3 % 4"));}
    @Test public void testError5() {assertEquals("<ERROR> Invalid operator encountered: ++", Calculator.produceAnswer("3 ++ 4"));}
    @Test public void testError6() {assertEquals("<ERROR> Invalid operator encountered: +=", Calculator.produceAnswer("3 += 4"));}
    @Test public void testError7() {assertEquals("<ERROR> Invalid operator encountered: |", Calculator.produceAnswer("3 | 4"));}
    @Test public void testError8() {assertEquals("<ERROR> Invalid operator encountered: -=", Calculator.produceAnswer("3 -= 4"));}
    @Test public void testError9() {assertEquals("<ERROR> Cannot divide by zero.", Calculator.produceAnswer("3 / 0"));}     
    @Test public void testError10() {assertEquals("<ERROR> Invalid value: 12x", Calculator.produceAnswer("3 + 12x"));}
    @Test public void testError11() {assertEquals("<ERROR> Invalid value: 3..9", Calculator.produceAnswer("3..9 + 1.2"));}
    @Test public void testError12() {assertEquals("<ERROR> Invalid value: 1@3d", Calculator.produceAnswer("3 + 1@3d"));}
    @Test public void testError13() {assertEquals("<ERROR> Invalid value: 3.2", Calculator.produceAnswer("3.2 - 1"));}
    @Test public void testError14() {assertEquals("<ERROR> Invalid operator encountered: %=", Calculator.produceAnswer("3 %= 4"));}
    @Test public void testError15() {assertEquals("<ERROR> Invalid operator encountered: /=", Calculator.produceAnswer("3 /= 4"));}
    @Test public void testError16() {assertEquals("<ERROR> Invalid operator encountered: \\", Calculator.produceAnswer("3 \\ 4"));}
    @Test public void testError17() {assertEquals("<ERROR> Invalid operator encountered: &", Calculator.produceAnswer("3 & 4"));}
    @Test public void testError18() {assertEquals("<ERROR> Invalid operator encountered: &&", Calculator.produceAnswer("3 && 4"));}
    @Test public void testError19() {assertEquals("<ERROR> Invalid operator encountered: ||", Calculator.produceAnswer("3 || 4"));}
    @Test public void testError20() {assertEquals("<ERROR> Invalid operator encountered: ^", Calculator.produceAnswer("3 ^ 4"));}
    @Test public void testError21() {assertEquals("<ERROR> Invalid value: true", Calculator.produceAnswer("3 * true"));}
    @Test public void testError22() {assertEquals("<ERROR> Invalid value: false", Calculator.produceAnswer("false || true"));}
    @Test public void testError23() {assertEquals("<ERROR> Invalid value: x", Calculator.produceAnswer("x + y"));}
    @Test public void testError24() {assertEquals("<ERROR> Invalid operator encountered: <=", Calculator.produceAnswer("3 <= y"));}
    @Test public void testError25() {assertEquals("<ERROR> Invalid value: y", Calculator.produceAnswer("y <= 3"));}

}
