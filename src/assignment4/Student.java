package assignment4;

public class Student extends ComputerEngineering{
    String areaOfInterest;
    int marks;

    public Student(String name, int rollNumber, int grNumber, String hobbies, String areaOfInterest, int marks) {
        super(name, rollNumber, grNumber, hobbies);
        this.areaOfInterest = areaOfInterest;
        this.marks = marks;
    }

    public String getAreaOfInterest() {
        return areaOfInterest;
    }

    public int getMarks() {
        return marks;
    }
}
