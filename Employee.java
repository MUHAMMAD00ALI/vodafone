package vodafone;

public class Employee {

    private int id;
    private String Name, Email, SSID, PhoneNumber, DOB, Address, branchCode;

    public Employee(int id, String Name, String Email, String SSID, String PhoneNumber, String DOB, String Address, String branchCode) {
        this.id = id;
        this.Name = Name;
        this.Email = Email;
        setSSID(SSID);
        setPhoneNumber(PhoneNumber);
        this.DOB = DOB;
        this.Address = Address;
        this.branchCode = branchCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSSID() {
        return SSID;
    }
    // length (14)
    public void setSSID(String SSID) {
        if(SSID.length()==14){this.SSID = SSID;}
        else{
        throw new IllegalStateException("Invalid SSID, length must be 14");
        }
        
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
    // must start with +2010 
    public void setPhoneNumber(String PhoneNumber) {
        if(PhoneNumber.startsWith("+2010")){
        this.PhoneNumber = PhoneNumber;
        }else{
        throw new IllegalStateException("Invalid Phone number, must start with (+2010)");
        }
        
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

}
