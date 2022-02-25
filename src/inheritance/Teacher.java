package inheritance;

public class Teacher extends Person{
    private String teacherID;
    private int salary;
    private int year;

    public String getTeacherID(){
        return teacherID;
    }
    public void setTeacherID(String teacherID){
        this.teacherID = teacherID;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public Teacher(String name, int age, int height, int weight, String teacherId, int salary, int year){
        super(name,age, height,weight);
        this.teacherID = teacherId;
        this.salary = salary;
        this.year = year;
    }
    public void show(){
        System.out.println("name of teacher" + getName());
        System.out.println("age of teacher" + getAge());
        System.out.println("height of teacher" + getHeight());
        System.out.println("weight of teacher" + getWeight());
        System.out.println("ID of teacher" + getTeacherID());
        System.out.println("salary of teacher" + getSalary());
        System.out.println("year of teacher" + getYear());

    }



}
