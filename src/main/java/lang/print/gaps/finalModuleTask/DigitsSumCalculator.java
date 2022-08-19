package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int f = number / 100, s = (number / 10) % 10, stl = (number / 100) % 10 ,l = number % 10;

        System.out.println(f+s+stl+l);
    }
}
