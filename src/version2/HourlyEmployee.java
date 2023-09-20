/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

import java.time.LocalDate;

/**
 *
 * @author Matt
 */
public class HourlyEmployee extends Employee {

    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }
    
    public HourlyEmployee(float totalHoursWorked, float ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        float regularHours = 40;
        float otRate = 1.5f;
        float otHours;
        float totalHoursworked = getTotalHoursWorked();

        if (totalHoursWorked <= regularHours) {
            return totalHoursWorked * getRatePerHour();
        } else {
            otHours = totalHoursworked - regularHours;

            double salary = (regularHours * getRatePerHour() + (otHours * otRate * getRatePerHour()));
            return salary;
        }
    }
    @Override
    public void displayInfo(){
        System.out.println(this);
        System.out.println("Total Hours Worked: " + getTotalHoursWorked());
        System.out.println("Rate per Hour: " + getRatePerHour());
        System.out.println("Salary: $" + computeSalary());
    }
}
