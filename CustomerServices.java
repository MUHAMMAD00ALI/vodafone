package vodafone;

public class CustomerServices {

    private String code, address, managerName;
    private int windows, numOfEmployee;
    private SinglyLinkedList<Employee> Em = new SinglyLinkedList<>();
    private SinglyLinkedList<Window> Win = new SinglyLinkedList<>();
    private Manager m ;
    
    public CustomerServices(String code, String address, String managerName, int windows, int numOfEmployee) {
        this.code = code;
        this.address = address;
        this.managerName = managerName;
        this.windows = windows;
        this.numOfEmployee = numOfEmployee;
    }

    public SinglyLinkedList<Window> getWin() {
        return Win;
    }

    public void setWin(SinglyLinkedList<Window> Win) {
        this.Win = Win;
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m =m;
    }

    public SinglyLinkedList<Employee> getEm() {
        return Em;
    }

    public void setEm(SinglyLinkedList<Employee> Em) {
        this.Em = Em;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getWindowsNum() {
        return windows;
    }

    public void setWindowsNum(int windows) {
        this.windows = windows;
    }

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

}
