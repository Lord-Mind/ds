import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String nessage){
        super(nessage);
    }
}

public class numberManeger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){

            try {
                int number = scanner.nextInt();
                if (number < 0){
                    throw new NegativeNumberException("Вы вели отрицательно число");

                }
                System.out.println("результат: " + 100/number);
                break;
            } catch (NegativeNumberException e){
                System.out.println("ошибка " + e.getMessage());
            } catch (InputMismatchException e){
                System.out.println("ошибка " + e.getMessage());
                scanner.next();
            } catch (ArithmeticException e){
                System.out.println("ошибка " + e.getMessage());
            }
        }
        scanner.close();
        
    }
}

