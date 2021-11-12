import java.util.Scanner;
class task {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter numb: ");
    String numb = myObj.nextLine();  
    System.out.println("Numb is: " + numb); 
    char[] chars = numb.toCharArray();
    int size = chars.length;
    StringBuilder strnew = new StringBuilder();
    strnew.append(numb);
    StringBuilder reversestr = strnew.reverse();
    String numb2 = reversestr.toString();
    char[] chars2 = numb2.toCharArray();
    boolean status = true;
    for(int i = 0;i<size;i++){
        if(chars[i]!=chars2[i]){
            status = false;
            break;
        }
    }
    System.out.println("Your result is" +" " + status);

  }
}