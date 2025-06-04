package Java8_150Coding.Thirteen13_Jan;

public class Student {
    int sid;
    String sname;
    String dob;
    double percentage;

    public Student() {
    }

    public Student(int sid, String sname, String dob, double percentage) {
        this.sid = sid;
        this.sname = sname;
        this.dob = dob;
        this.percentage = percentage;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public  double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", dob='" + dob + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
