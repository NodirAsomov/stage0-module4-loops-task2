package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
         int n=0;
        while (n<=lastPrinted){
            System.out.println(n);
            n++;
        }
    }

    public static void main(String[] args) {
        NaturalNumbers naturalNumbers = new NaturalNumbers();
        naturalNumbers.naturalNumbersPrinter(30);
    }
}
