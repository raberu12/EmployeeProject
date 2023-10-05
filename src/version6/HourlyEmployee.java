package version6;

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

    public HourlyEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked, float ratePerHour) {
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
    
    @Override
    public double computeSalary() {
        float regularHours = 40;
        float otRate = 1.5f;
        float totalHours = getTotalHoursWorked();

        if (totalHours <= regularHours) {
            return totalHours * getRatePerHour();
        }

        float otHours = totalHours - regularHours;
        return (regularHours * getRatePerHour()) + (otHours * otRate * getRatePerHour());
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTotal Hours Worked: " + getTotalHoursWorked()
                + "\nRate per Hour: " + getRatePerHour()
                + "\nSalary: $" + computeSalary()
                + "\n";

    }
}
