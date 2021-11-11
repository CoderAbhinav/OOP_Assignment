package assignment4;

public class ComputerEngineering {
    String name;
    int rollNumber;
    int grNumber;
    String hobbies;

    public ComputerEngineering(String name, int rollNumber, int grNumber, String hobbies) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grNumber = grNumber;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getGrNumber() {
        return grNumber;
    }

    public String getHobbies() {
        return hobbies;
    }
}
