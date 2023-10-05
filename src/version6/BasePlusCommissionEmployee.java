package version6;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalPiecesFinished, totalSales, ratePerPiece);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(Name empName, LocalDate empDateHired, LocalDate empBirthDate, float totalPiecesFinished, double totalSales, float ratePerPiece, double baseSalary) {
        super(empName, empDateHired, empBirthDate, totalPiecesFinished, totalSales, ratePerPiece);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return baseSalary + super.computeSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nBase Salary: $" + getBaseSalary()
                + "\n";
    }
}
