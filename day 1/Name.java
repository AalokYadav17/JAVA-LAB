
import java.util.Scanner;

class Name {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String first = sc.nextLine();
        System.out.println("Enter Last name");
        String last = sc.nextLine();
        System.out.println(last + " " + first);
        sc.close();
    }
}
