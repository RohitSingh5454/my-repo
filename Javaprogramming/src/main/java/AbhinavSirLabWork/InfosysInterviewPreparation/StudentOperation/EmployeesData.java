package AbhinavSirLabWork.InfosysInterviewPreparation.StudentOperation;

public class EmployeesData {
    private int roll_No;
    private String name;
    private String subject;
    private double percentage;

    public EmployeesData(int roll_No, String name, String subject, double percentage) {
        this.roll_No = roll_No;
        this.name = name;
        this.subject = subject;
        this.percentage = percentage;
    }

    public EmployeesData() {
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "EmployeesData{" +
                "roll_No=" + roll_No +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
