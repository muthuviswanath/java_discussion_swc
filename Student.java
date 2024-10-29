public class Student {
    int rollno;
    String name;
    String dept;
    String bloodgroup;

    Student(int rollno, String name, String dept, String bloodgroup){
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        this.bloodgroup= bloodgroup;
    }

    public static void main(String[] args) {
        Student s = new Student(108, "Muthu", "BCA", "A+ve");
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.dept);
        System.out.println(s.bloodgroup);
    }
}
