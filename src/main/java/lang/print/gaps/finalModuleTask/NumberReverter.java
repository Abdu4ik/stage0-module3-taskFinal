package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int f = number / 100, s = (number / 10) % 10, l = number % 10;

        System.out.println(l + "" + (s) + "" + f);

    }
}
