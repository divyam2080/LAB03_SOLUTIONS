package lab04;

public class Student extends Person {
    private long uniRollNumber;
    private String courseName;

    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
    public String getCourseName() {
        return courseName;
    }
    public long getUniRollNumber() {
        return uniRollNumber;
    }
    public void setCourseName(String n)
    { courseName = n;}
    public void setUniRollNumber(long a)
    { uniRollNumber = a;}


}
