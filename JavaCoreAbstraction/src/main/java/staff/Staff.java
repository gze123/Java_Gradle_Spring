package staff;

import java.math.BigDecimal;

abstract class Staff {
    private String department,title;
    private BigDecimal salary;
    private boolean executive;

    public Staff(String department, String title, BigDecimal salary) {
        this.department = department;
        this.title = title;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public boolean isExecutive() {
        return executive;
    }

    public void setExecutive(boolean executive) {
        this.executive = executive;
    }

    abstract int annualLeave();

    abstract  double increment();

    public abstract String toString();

}
