package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n=0;
        while (n<=multiplyByAndToInclusive){
            System.out.println(n*multiplyByAndToInclusive);
            n++;
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication =new Multiplication();
        multiplication.printMultiplied(20);
    }
}
