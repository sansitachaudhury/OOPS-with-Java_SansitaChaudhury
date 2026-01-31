class Student {
    int roll;
    String name;
    String sec;
    Student(){
        roll = 0;
        name = "";
        sec = "";
    }
    Student(int r, String n, String s) {
        roll = r;
        name = n;
        sec = s;
    }
}
public class exp1 {
    public static void main(String[] args) {
        Student obj = new Student(201, "Sansita", "616B");
        System.out.println("Roll No: " + obj.roll);
        System.out.println("Name: " + obj.name);
        System.out.println("Section: " + obj.sec);
    }
}