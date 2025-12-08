
import java.util.Scanner;

class Student {

    String name;
    int Roll_No;
    String Section;
    String Branch;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        name = sc.nextLine();
        System.out.println("Enter your Roll No : ");
        Roll_No = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Section : ");
        Section = sc.nextLine();
        System.out.println("Enter your Branch : ");
        Branch = sc.nextLine();
        sc.close();
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No :" + Roll_No);
        System.out.println("Section : " + Section);
        System.out.println("Branch : " + Branch);
    }

    public static void main(String args[]) {
        Student S = new Student();
        S.input();
        S.display();
    }
}
