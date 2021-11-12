import java.util.Scanner;
class task2 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter numb: ");
    String numb = myObj.nextLine();  
    System.out.println("Numb is: " + numb); 
    StringBuilder strnew = new StringBuilder();
    strnew.append(numb);
    StringBuilder reversestr = strnew.reverse();
    String numb2 = reversestr.toString();
    System.out.println("Reverse int is: "+" " +numb2);

  }
}