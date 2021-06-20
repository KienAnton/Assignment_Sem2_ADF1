package assignment.sem2.entity;

import java.util.Date;

public class Teacher {
    private String rollNumber;
    private String fullName;
    private String email;
    private Date taughtSince;

    public Teacher() {
    }

    public Teacher(String rollNumber, String fullName, String email, Date taughtSince) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.email = email;
        this.taughtSince = taughtSince;
    }

    @Override
    public String toString() {
        return String.format("%10s%10s%10s | %10s%15s%15s | %5s%20s%5s | %5s%10s%5s\n",
                "", rollNumber, "",
                "", fullName, "",
                "", email, "", "",
                "", taughtSince, "", ""
        );
    }


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTaughtSince() {
        return taughtSince;
    }

    public void setTaughtSince(Date taughtSince) {
        this.taughtSince = taughtSince;
    }

}
