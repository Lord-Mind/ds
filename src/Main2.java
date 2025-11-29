//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] mass = {1,2,3,4,5,6,7,8,9,0};
        for (int number : mass) {
            System.out.println(number);
        }

        for (int i = 1; i < mass.length; i++){
            mass[i] = mass[i] * 2;
        }

        for (int number : mass) {
            System.out.println(number);
        }
    }
}
