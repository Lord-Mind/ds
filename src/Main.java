//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1;i <= 10; i ++) {
            System.out.println(i);
        }

        System.out.println("----------------------------");

        for(int i = 0;i <= 21; i++){
            if (i % 2 != 1){
                System.out.println(i);
            }
        }

        System.out.println("----------------------------");

        for (int i = 7; i < 99; i += 7){
            System.out.println(i);
        }

        System.out.println("----------------------------");

        int nak = 12000;
        int banka = 0;
        for (int i = 1; i <= 12; i++){
            banka += nak;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + banka + " рублей");
        }


    }
}