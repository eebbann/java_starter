import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        boolean isBetween = (number1 >= number2 && number1 <= number3) || (number1 >= number3 && number1 <= number2);

        System.out.println(isBetween);
    }
//   {
//        Scanner canner = new Scanner(System.in);
//
//
//        int h1 = canner.nextInt();
//        int h2 = canner.nextInt();
//        int h3 = canner.nextInt();
//
//        boolean man = (h1 <= h2) && ( h2 >= h3);
//
//        System.out.println(man);
//    }
}
