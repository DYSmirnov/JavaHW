package HW2.simple.calculator;

public class TestCalc {
    public static void main(String[] args) {
        long a = 2;
        long b = 10000000000L;
        Calc.sum(2,3);
        Calc.sum(2.1,3);
        Calc.sum(a,b);

        Calc.sub(100,3);
        Calc.sub(2.1,3);
        Calc.sub(a,b);

        Calc.mult(10,100);
        Calc.mult(10.0,20.2);
        Calc.mult(a,b);

        Calc.div(5.0,2.2);
        Calc.div(10,3);
        Calc.div(b,a);



    }
}
