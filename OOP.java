
class Student {

    String Name;
    int Rollno;

    public void studentinfo() {
        System.out.println(this.Name);
        System.out.println(this.Rollno);
    }

    Student(String Name, int Rollno) {
        this.Name = Name;
        this.Rollno = Rollno;

    }

}

public class OOP {

    public static void main(String args[]) {
        Student S1 = new Student("Aalok", 21);
        S1.studentinfo();
    }
}

// class Pen {
//     String type;
//     String Name;
//     String Color;
//     void typeofwriting() {
//         System.out.println("This Pen is for Writing Long and it ranges more");
//     }
//     void Color() {
//         System.out.println("The color of pen is : ");
//         System.out.println(this.Color);
//     }
// }
// public class OOP {
//     public static void main(String args[]) {
//         Pen pen1 = new Pen();
//         Pen pen2 = new Pen();
//         pen1.type = "Gel Pen";
//         pen1.Name = "Technotip";
//         pen1.Color = "Black";
//         pen2.Color = "Blue";
//         pen2.type = "Ball  pen";
//         pen2.Name = "Fine grip";
//         System.out.println("This is : " + pen1.type);
//         System.out.println("This Pen Name is : " + pen1.Name);
//         pen1.Color();
//         pen1.typeofwriting();
//         System.out.println("This is : " + pen2.type);
//         System.out.println("This Pen Name is : " + pen2.Name);
//         pen2.Color();
//         pen1.typeofwriting();
//     }
// }
