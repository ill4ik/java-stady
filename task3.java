import java.util.Scanner;

class task3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numb a: ");
        int dividend = myObj.nextInt();
        System.out.println("Numb a is: " + dividend);
        System.out.println("Enter numb b: ");
        int divisor = myObj.nextInt();
        System.out.println("Numb b is: " + divisor);
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
            if (sign == -1)
            quotient = -quotient;

        System.out.println(quotient);

    }
}