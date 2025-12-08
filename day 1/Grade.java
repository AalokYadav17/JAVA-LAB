import java.util.Scanner;
class Grade{
    int mark;
    void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Mark : ");
        mark = sc.nextInt();
    }
    void result(){
        if (mark >= 90){
            System.out.println("Your Garde : O");
        }
        else if (mark >=80){
            System.out.println("Your Garde : E");
        }
         else if (mark >=70){
            System.out.println("Your Garde : A");
        }
         else if (mark >=60){
            System.out.println("Your Garde : B");
        }
         else if (mark >=50){
            System.out.println("Your Garde : C");
        }
         else if (mark >=40){
            System.out.println("Your Garde : D");
        }
         else{
            System.out.println("Fail");
        }

    }
    public static void main(String args []) {
        Grade G = new Grade();
        G.input();
        G.result();
    }
}