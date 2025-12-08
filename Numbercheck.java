
import java.util.Scanner;

class Numbercheck {

    int num;
    int evencount = 0;
    int oddcount = 0;

    void Numberinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the 10 Numbers : ");
        for (int i = 0; i < 10; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
    }

    void display() {
        System.out.println("The even Numbers are :" + evencount);
        System.out.println("The odd Numbers are : " + oddcount);
    }

    public static void main(String args[]) {
        Numbercheck N1 = new Numbercheck();
        N1.Numberinput();
        N1.display();

    }
}
