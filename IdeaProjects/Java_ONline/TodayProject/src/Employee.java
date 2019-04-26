public class Employee {


    String employeeEmail ;
    String employeeName;
    String salary;
    String department;

    public Employee(){}


    public Employee(String employeeEmail, String employeeName, String salary,String department) {
        this.employeeEmail = employeeEmail;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

    public String getDepartment(){
        return department;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
