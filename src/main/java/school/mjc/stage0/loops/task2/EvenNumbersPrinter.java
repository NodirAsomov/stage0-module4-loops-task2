package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int n = 0;

        while (n <= printTillInclusive) {

            System.out.println(n);
            n=n+2;
        }
    }

    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        evenNumbersPrinter.printEvenNumbers(20);
    }
}