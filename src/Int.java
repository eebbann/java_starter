import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
//        int a = scanner.nextInt();
//        int diff1= a * 60;
//        int b = scanner.nextInt();
//        int diff2= diff1 + b;
//        int c = scanner.nextInt();
//        int diff3= diff2 * 60 + c;
//        int d = scanner.nextInt();
//        int diff4= d * 60 ;
//
//        int e = scanner.nextInt();
//        int diff5= diff4 + e;
//
//        int f = scanner.nextInt();
//        int diff6= diff5 * 60 + f;
//
//        int total = diff6 - diff3;
//
//  int a = scanner.nextInt();
//        int b = a % 2
//
//        System.out.println(total);
        int a = scanner.nextInt();
        int b = a +  (2 - a % 2);
        System.out.println(b);

    }

}
//    public static void  main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int sum = a + b;
//            System.out.println(sum);
//        //calculation
//           int number = 12241;
//           int digit = ((number % 100) / 10) % 10;
//           System.out.println(digit);
//            }
//        }



