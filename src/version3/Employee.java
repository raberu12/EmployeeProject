package version3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Matt
 */
public class Employee {

    private int empID;
    private Name empName;
    private LocalDate empDateHired;
    private LocalDate empBirthDate;

    public Employee() {
    }

    public Employee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public LocalDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(LocalDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return String.format("Employee ID: %d\n"
                + "Employee Name: %s\n"
                + "Birth Date: %s\n"
                + "Date Hired: %s",
                empID,
                empName,
                empBirthDate.format(dateFormatter),
                empDateHired.format(dateFormatter));

    }

}
