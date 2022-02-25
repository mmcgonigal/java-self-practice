package inheritance;

public class Student extends Person{
    private String studentID;
    private int grade;
    private double GPA;

    public String getStudentID(){
        return studentID;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public double getGPA(){
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA )//
    // String name int age int height int weight // by putting in parameter, we can reset inherited fields for instance of Student,
    {
        super(name,age,height,weight); // this means i will use parents' constructor
        this.studentID = studentID;
        this.grade = grade;
        this.GPA = GPA;
    }
    public void show(){
        System.out.println("name of student" + getName());
        System.out.println(("age of student") + getAge());
        System.out.println(("weight of student") + getWeight());
        System.out.println(("height of student") + getHeight());
        System.out.println(("student ID of student") + getStudentID());
        System.out.println(("grade of student") + getGrade());
        System.out.println(("GPA of student") + getGPA());

    }




}
