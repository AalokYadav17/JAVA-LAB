import java.util.Scanner;
class Nameswap{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Name:");
    String First = sc.nextLine();
    System.out.println("Enter Second Name :");
    String Second = sc.nextLine();
    System.out.println(Second+" "+First);
   }
}