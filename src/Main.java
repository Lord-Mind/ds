//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 50){
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

        System.out.println("-----------------------------");
        int n2 = 1;
        int ncount = 0;
        do {
            if (n2 % 7 == 0) {
                ncount++;
            }
            n2 += 1;
        } while (n2 <= 100);
        System.out.println(ncount);
        System.out.println("-----------------------------");
        int sum = 0;
        int n3 = 1;
        while (n3 <= 100){
            sum += n3;
            n3++;
        }
        System.out.println(sum);

        System.out.println("-----------------------------");
        int nc = 0;
        int nt;
        do{
            nt = (int) (Math.random() * (20 - 1 + 1)) + 1;
            if (nt != 15) {
                nc++;
            }
            //System.out.println(nt);
        }while (nt != 15);
        System.out.println(nc);

    }
}
