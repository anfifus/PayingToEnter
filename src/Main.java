import java.util.Scanner;

public class Main {

    private static final int YEARSMIN = 4;
    private static final int YEARSMAX = 18;

    //Si el client és menor de 4 anys pot entrar de franc, si té entre 4 i 18 anys ha de pagar
//5€ i si és més gran de 18 anys, 10€.
    public static void main(String[] args) {
        int age = askUserAge();
        showTicketCashToPay();
        double cashToPay = calculateTicketDependOfAge(age);
        showCashHaveToPay(age, cashToPay);
    }

    private static void showCashHaveToPay(int age, double cashToPay) {
        System.out.println("The user with age " + age + " has to pay " + cashToPay);
    }

    private static double calculateTicketDependOfAge(int age) {
        return calculatingCash(age);
    }

    private static double calculatingCash(int age) {
        double cashToPay = 0;
        if (age < YEARSMIN) {
            cashToPay = 0;
        } else if (age > YEARSMIN && age < YEARSMAX) {
            cashToPay = 5;
        } else if (age > YEARSMAX) {
            cashToPay = 10;
        }
        return cashToPay;
    }

    private static void showTicketCashToPay() {
        System.out.println("If client has less 4 years is free");
        System.out.println("If client has between 4 and 18 years has to pay 5");
        System.out.println("If client has more of 18 years has to pay 10");
    }

    private static int askUserAge() {
        System.out.println("Write the user age");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
