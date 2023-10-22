package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
             int result=1;
             int base=2;
             int i=0;
        while (i <power) {
            result *= base;
            System.out.println("2^"+ i +" "+result);
            i++;
        }

    }

    public static void main(String[] args) {
        PowerOfTwo power=new PowerOfTwo();
        power.printPower(3);
    }
}
