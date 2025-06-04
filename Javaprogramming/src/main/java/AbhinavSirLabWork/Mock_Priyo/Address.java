package AbhinavSirLabWork.Mock_Priyo;

public class Address {
    int pinCode;
    String blockNo;
    String society;
    int floorNo;

    public Address() {
    }

    public Address(int pinCode, String blockNo, String society, int floorNo) {
        this.pinCode = pinCode;
        this.blockNo = blockNo;
        this.society = society;
        this.floorNo = floorNo;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pinCode=" + pinCode +
                ", blockNo='" + blockNo + '\'' +
                ", society='" + society + '\'' +
                ", floorNo=" + floorNo +
                '}';
    }
}
