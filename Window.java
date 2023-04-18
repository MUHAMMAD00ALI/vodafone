package vodafone;

public final class Window {

    private int label;
    private LinkedQueue<Customer> Cusomers = new LinkedQueue<>();
    private Employee emp ;

    public Window(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public LinkedQueue<Customer> getCusomers() {
        return Cusomers;
    }

    public void setCusomers(LinkedQueue<Customer> Cusomers) {
        this.Cusomers = Cusomers;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = new Employee(emp.getId(), emp.getName(), emp.getEmail(), emp.getSSID(), emp.getPhoneNumber(), emp.getDOB(), emp.getAddress(), emp.getBranchCode());
    }

}
