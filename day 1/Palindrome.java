
import java.util.Scanner;

class Palindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int lastdigit;
        while (num > 0) {  
            lastdigit = num % 10;
            reverse = reverse * 10 + lastdigit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("The number " + reverse + " is palindrome "); 
        }else {
            System.out.println("The number is " + original + " is not palindrome ");

        }
    }
}
