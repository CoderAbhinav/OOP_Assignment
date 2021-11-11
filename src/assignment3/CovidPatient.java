package assignment3;

public class CovidPatient {
    // basic details
    public String name;
    public String id;
    public String dateOfBirth;

    // contact details
    public String mobileNo;
    private String address;
    private String uid;

    // medical details
    public String bloodGroup;
    private boolean isCovidPositive = false;

    // default constructor
    public CovidPatient(){
        System.out.println("Default Constructor Called");
    }
    // basic constructor
    public CovidPatient(String id, String name, String mobileNo, boolean isCovidPositive){
        System.out.println("Overloaded Constructor Called");
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.isCovidPositive = isCovidPositive;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void printLine(){
        String pst = (isCovidPositive)? "Positive":"Negative";
        System.out.printf("\n%5s%10s%10s", this.id, this.name, pst);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setCovidPositive(boolean covidPositive) {
        isCovidPositive = covidPositive;
    }
}
