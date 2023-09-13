package employee.version1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HourlyEmployee {

    private int empID;
    private String empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = 100.00f;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double computeSalary() {
        float regularHours = 40;
        float otRate = 1.5f;
        float otHours;
        float totalHoursworked = getTotalHoursWorked();
        
        if(totalHoursWorked <= regularHours){
            return totalHoursWorked * getRatePerHour();
        }else{
            otHours = totalHoursworked - regularHours;
            
            double salary = (regularHours * getRatePerHour() + (otHours * otRate * getRatePerHour()));
            return salary;
        }
    }

    public void displayInfo() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Emplyee Name: " + getEmpName());
        System.out.println("Date Hired: " + getEmpDateHired().format(dateFormatter));
        System.out.println("Date of Birth: " + getEmpBirthDate().format(dateFormatter));
        System.out.println("Total Hours Worked: " + getTotalHoursWorked());
        System.out.println("Rate per Hour: " + getRatePerHour());
        
        double salary = computeSalary();

        System.out.println("Salary: $" + salary);
    }

    @Override
    public String toString() {
        double salary = computeSalary();
        return "HourlyEmployee{" + "empID = " + empID + ", empNam e = " + empName + ", "
                + "empDateHired = " + empDateHired + ", empBirthDate = " + empBirthDate + ", "
                + "totalHoursWorked = " + totalHoursWorked + ", ratePerHour = " + ratePerHour
                + "salary = " + salary + '}';
    }

}
