public class RecordList {
    private String iD;

    private String name;

    private String address;

    private String overdueBalance;

    public RecordList() {};

    public RecordList(String ID, String name, String address, String overdueBalance){
        this.iD = ID;
        this.name = name;
        this.address = address;
        this.overdueBalance = overdueBalance;
    }

    public String getOverdueBalance() {
        return overdueBalance;
    }

    public void setOverdueBalance(String overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String toString(){
        String result;
        result = iD + " " + name + " " + address + " " + overdueBalance;
        return result;
    }
}
