package assignment1;

public class Student {
    public static int studentCount = 0;
    private final char grade;
    private int averageMarks;
    public String name;
    public String uid;

    Student(String uid, String name, int averageMarks){
        this.studentCount++;
        this.uid = uid;
        this.name = name;
        this.averageMarks = averageMarks;
        if(averageMarks>=80)
        {
            this.grade = 'A';
        }
        else if(averageMarks>=60)
        {
            this.grade = 'B';
        }
        else if(averageMarks>=40)
        {
            this.grade = 'C';
        }
        else
        {
            this.grade = 'D';
        }

    }

    public void printDetails()
    {
        System.out.printf("%5s%10s%5s%8s\n", this.uid,this.name,this.averageMarks, this.grade);
    }

}
