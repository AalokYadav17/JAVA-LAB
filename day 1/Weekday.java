
import java.util.Scanner;

class Weekday {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day Number of month (0-31):");
        int dayno = sc.nextInt();
        int day = dayno % 7;
        switch (day) {
            case 1 ->
                System.out.println("The Day is Sunday");
            case 2 ->
                System.out.println("The Day is Monday");
            case 3 ->
                System.out.println("The Day is Tuesday");
            case 4 ->
                System.out.println("The Day is Wednesday");
            case 5 ->
                System.out.println("The Day is Thrusday");
            case 6 ->
                System.out.println("The Day is Friday");
            case 0 ->
                System.out.println("The Day is Saturday");

        }
    }
}
