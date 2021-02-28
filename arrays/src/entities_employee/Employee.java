package entities_employee;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;

    public Employee(){}

    public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public void increaseSalary(double percentage) {
        this.employeeSalary += this.employeeSalary * percentage / 100.0;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return this.employeeId + ", " + this.employeeName + ", " + String.format("%.2f", this.employeeSalary);
    }
}
