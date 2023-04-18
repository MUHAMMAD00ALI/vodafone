
package vodafone;

public class Manager extends Employee {
    private String Department;

    public Manager(String Department, int id, String Name, String Email, String SSID, String PhoneNumber, String DOB, String Address, String branchCode) {
        super(id, Name, Email, SSID, PhoneNumber, DOB, Address, branchCode);
        this.Department = Department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
    
}
