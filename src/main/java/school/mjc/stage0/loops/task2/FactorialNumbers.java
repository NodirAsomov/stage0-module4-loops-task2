package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int factorial = 1;
        while (i < printToInclusive) {

            i++;
            factorial=factorial * i;
            System.out.println(i + " " + factorial);

        }
    }
            //System.out.printf("Factorial of %d = %d", num, factorial);




    public static void main(String[] args) {
        FactorialNumbers factorialNumbers=new FactorialNumbers();
        factorialNumbers.printFactorialRow(10);
    }
}
