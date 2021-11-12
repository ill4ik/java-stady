import java.util.Scanner;

class task4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numb: ");
        int a = myObj.nextInt();
        System.out.println("Numb is: " + a);
        if (a == 0 || a == 1)
            System.out.print(a);
        int i = 1, result = 1;
        while (result <= a) {
            i++;
            result = i * i;
        }
        System.out.println(i-1);
    }
}