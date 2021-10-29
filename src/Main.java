import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter years of Service: ");

        int years = scanner.nextInt();
        double bonusPercent = 0;

        if (years <= 1) {

            bonusPercent = 10;

        } else if (years >= 2 && years <= 5) {

            bonusPercent = 20;

        } else if (years >= 6 && years <= 10) {

            bonusPercent = 50;

        } else {

            bonusPercent = 75;

        }

        System.out.print("Enter salary: ");
        double salary = scanner.nextInt();

        double bonus = (salary / 100) * bonusPercent;

        System.out.println("Salary with bonus is " + (salary + bonus));
    }
}
