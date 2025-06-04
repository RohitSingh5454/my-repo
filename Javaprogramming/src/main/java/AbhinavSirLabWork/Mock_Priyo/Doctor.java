package AbhinavSirLabWork.Mock_Priyo;

public class Doctor {
    int dId;
    String dName;
    double dSalary;
    Address address;

    public Doctor() {
    }

    public Doctor(int dId, String dName, double dSalary, Address address) {
        this.dId = dId;
        this.dName = dName;
        this.dSalary = dSalary;
        this.address = address;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public double getdSalary() {
        return dSalary;
    }

    public void setdSalary(double dSalary) {
        this.dSalary = dSalary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dSalary=" + dSalary +
                ", address=" + address +
                '}';
    }
}
