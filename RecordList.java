public class RecordList {

    /*Here is all the variables in the record list*/
    private String iD;

    private String name;

    private String address;

    private String overdueBalance;

    /*Here I have a plain constructor and another one that will accept variable to add to record. I originally did
    * not have the plain constructor but had to add it when I tried to implement the RecordList class into the main
    * class. I ran into a problem where program required I have variables already ready to enter into constructor*/
    public RecordList() {};

    public RecordList(String ID, String name, String address, String overdueBalance){
        this.iD = ID;
        this.name = name;
        this.address = address;
        this.overdueBalance = overdueBalance;
    }

    /*These are the getters and setters of each variable*/
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

    /*Here is a string method created to print each element of the Array list into one line to keep it clean*/
    public String toString(){
        String result;
        result = iD + " " + name + " " + address + " " + overdueBalance;
        return result;
    }
}
